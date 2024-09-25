/* Consider the following interface definition:*/
interface Base
{
boolean m1 ();
byte m2(short s);
}
/* which one of the given code fragment will compile without error(s)? */

/*
abstract class Class2 implements Base {
    public boolean m1() { 
        return (7 > 4); 
    }
}
Valid: This correctly implements the m1() method from the Base interface.

interface Base2 implements Base {}
Invalid: An interface cannot implement another interface; it can only extend another interface.

abstract class Class2 extends Base {
    public boolean m1() { 
        return true; 
    }
}
Invalid: Abstract classes cannot extend interfaces directly; they must implement all interface methods.

abstract class Class2 implements Base {
    protected boolean m1() { 
        return (5 > 7); 
    }
}
Invalid: The method m1() must be public in order to satisfy the interface contract, which requires all methods to be public.
*/