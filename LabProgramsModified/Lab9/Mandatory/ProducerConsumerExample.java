/*Write and execute a java program to implement a producer and consumer problem
using Inter-thread communication. */
// Shared buffer
class Buffer {
    private int[] buffer = new int[10];
    private int count = 0; // Track the number of elements in the buffer

    // Produce an item and store it in the buffer
    public synchronized void produce(int item) throws InterruptedException {
        // Wait if the buffer is full
        while (count == buffer.length) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait(); // Wait until buffer has space
        }
        // Add item to buffer
        buffer[count] = item;
        count++;
        System.out.println("Produced: " + item);
        notify(); // Notify consumer that new item is available
    }

    // Consume an item from the buffer
    public synchronized int consume() throws InterruptedException {
        // Wait if the buffer is empty
        while (count == 0) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait(); // Wait until buffer has items
        }
        // Consume item from buffer
        int item = buffer[count - 1];
        count--;
        System.out.println("Consumed: " + item);
        notify(); // Notify producer that there is space in the buffer
        return item;
    }
}

// Producer thread
class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int item = 0;
        try {
            while (true) {
                buffer.produce(item++);
                Thread.sleep(1000); // Simulate time taken to produce an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Consumer thread
class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1500); // Simulate time taken to consume an item
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(); // Shared buffer

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}

/* SAMPLE OUTPUT
roduced: 0
Consumed: 0
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Produced: 4
Consumed: 4
Produced: 5
Consumed: 5
Produced: 6
Produced: 7
Consumed: 7
Produced: 8
Consumed: 8
Produced: 9
Produced: 10
Consumed: 10
Produced: 11
Consumed: 11
Produced: 12
Produced: 13
Consumed: 13
Produced: 14
Consumed: 14
Produced: 15
Produced: 16
Consumed: 16
Produced: 17
Consumed: 17
Produced: 18
Produced: 19
Consumed: 19
Produced: 20
Consumed: 20
Produced: 21
Produced: 22
Consumed: 22
Produced: 23
Consumed: 23
Produced: 24
Produced: 25
Consumed: 25
Produced: 26
Consumed: 26
Produced: 27
Produced: 28
Consumed: 28
Produced: 29
Consumed: 29
Produced: 30
Buffer is full. Producer is waiting...
Consumed: 30
Produced: 31
Buffer is full. Producer is waiting...
Consumed: 31
Produced: 32
Buffer is full. Producer is waiting...
Consumed: 32
Produced: 33
Buffer is full. Producer is waiting...
Consumed: 33
Produced: 34
Buffer is full. Producer is waiting...
Consumed: 34
Produced: 35
Buffer is full. Producer is waiting...
Consumed: 35
Produced: 36
Buffer is full. Producer is waiting...
Consumed: 36
Produced: 37
Buffer is full. Producer is waiting...
Consumed: 37
Produced: 38
Buffer is full. Producer is waiting...
Consumed: 38
Produced: 39
Buffer is full. Producer is waiting...
Consumed: 39
Produced: 40
Buffer is full. Producer is waiting...
Consumed: 40
Produced: 41
Buffer is full. Producer is waiting...
Consumed: 41
Produced: 42
Buffer is full. Producer is waiting...
Consumed: 42
Produced: 43
Buffer is full. Producer is waiting...
Consumed: 43
Produced: 44
Buffer is full. Producer is waiting...
Consumed: 44
Produced: 45
Buffer is full. Producer is waiting...
Consumed: 45
Produced: 46
Buffer is full. Producer is waiting...
Consumed: 46
Produced: 47
Buffer is full. Producer is waiting...
Consumed: 47
Produced: 48
Buffer is full. Producer is waiting...
Consumed: 48
Produced: 49
Buffer is full. Producer is waiting...
Consumed: 49
Produced: 50
Buffer is full. Producer is waiting...
Consumed: 50
Produced: 51
Buffer is full. Producer is waiting...
Consumed: 51
Produced: 52
Buffer is full. Producer is waiting...
Consumed: 52
Produced: 53
Buffer is full. Producer is waiting...
Consumed: 53
Produced: 54
Buffer is full. Producer is waiting...
Consumed: 54
Produced: 55
Buffer is full. Producer is waiting...
Consumed: 55
Produced: 56
Buffer is full. Producer is waiting...
Consumed: 56
Produced: 57
Buffer is full. Producer is waiting...
Consumed: 57
Produced: 58
Buffer is full. Producer is waiting...
Consumed: 58
Produced: 59
Buffer is full. Producer is waiting...
Consumed: 59
Produced: 60
Buffer is full. Producer is waiting...
Consumed: 60
Produced: 61
Buffer is full. Producer is waiting...
Consumed: 61
Produced: 62
Buffer is full. Producer is waiting...
Consumed: 62
Produced: 63
Buffer is full. Producer is waiting...
Consumed: 63
Produced: 64
Buffer is full. Producer is waiting...
Consumed: 64
Produced: 65
Buffer is full. Producer is waiting...
Consumed: 65
Produced: 66
Buffer is full. Producer is waiting...
Consumed: 66
Produced: 67
Buffer is full. Producer is waiting...
Consumed: 67
Produced: 68
Buffer is full. Producer is waiting...
Consumed: 68
Produced: 69
Buffer is full. Producer is waiting...
Consumed: 69
Produced: 70
Buffer is full. Producer is waiting...
Consumed: 70
Produced: 71
Buffer is full. Producer is waiting...
Consumed: 71
Produced: 72
Buffer is full. Producer is waiting...
Consumed: 72
Produced: 73*/