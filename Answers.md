#### What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?
The methods are used in order to be called by other methods and making sure the tests can make necessary changes to the stack.

#### Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
We use arguements to break down the methods into smaller steps up to the base case. The arguments update the variables to move from case to case.

#### What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?
populateList = O(n)

populateFifoList = O(n)

ReverseLines.printReverse = O(n)

#### Which of these methods can be implemented using while loops?
All three of the methods could be implemented using while loops.
