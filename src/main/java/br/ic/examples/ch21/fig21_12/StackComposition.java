package br.ic.examples.ch21.fig21_12;
// Fig. 21.12: StackComposition.java

import br.ic.examples.ch21.fig21_03_05.EmptyListException;

// StackComposition uses a composed List object.

import br.ic.examples.ch21.fig21_03_05.List;

public class StackComposition<T>
{
   private List<T> stackList;

   // constructor
   public StackComposition() 
   { 
      stackList = new List<T>("stack"); 
   } 

   // add object to stack
   public void push(T object)
   { 
      stackList.insertAtFront(object); 
   } 

   // remove object from stack
   public T pop() throws EmptyListException
   { 
      return stackList.removeFromFront(); 
   } 

   // determine if stack is empty
   public boolean isEmpty() 
   { 
      return stackList.isEmpty(); 
   } 

   // output stack contents
   public void print() 
   { 
      stackList.print(); 
   } 
} // end class StackComposition


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
