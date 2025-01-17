# Report for assignment 3

## Project

Name: TheAlgorithms/Java

URL (source project): https://github.com/TheAlgorithms/Java  
Group 17 Fork: https://github.com/einbergisak/Assignment3

TheAlgorithms is an open source resource for learning data structures & algorithms.  
Users interact with the algorithms via Gitpod, a cloud development environment.

## Onboarding experience

The project was compiled and tested successfully on first attempt after a fresh clone of the repo with `mvn clean verify`.  
These instructions however were not documented on the repo itself. The project is inteded to be used via Gitpod, and instructions
are included to do that instead. To test and compile, we relied on our own experience to run the correct command
to run the project locally.

To compile the project no extra dependancies or components were required (except Maven to exectue the compilation).  
As the project has implemented Maven, running the tests was as easy as executing `mvn test`. The tests ran very fast and smoothly
on all our machines.

We will be continuing with this Github project for this assignment as it does lack coverage, has open issues and offers approachable
problems for us to solve.

## Complexity

### 1. What are your results for ten complex functions?

| Method                            | Member 1        | Member 2        | Lizard |
| --------------------------------- | --------------- | --------------- | ------ |
| BinarySearch2dArray::BinarySearch | 10 + 2 - 8 = 4  | 10 + 2 - 8 = 4  | 11     |
| LinkListSort::isSorted            | 12 + 2 - 4 = 10 | 12 + 2 - 4 = 10 | 13     |
| FordFulkerson::networkFlow        | 10 + 2 - 1 = 11 | 10 + 2 - 1 = 11 | 11     |
| BinaryTree::remove                | 16 + 2 - 8 = 10 | 16 + 2 - 8 = 10 | 17     |
| BellmanFord::go                   | 12 + 2 - 0 = 14 | 11 + 2 - 0 = 13 | 13     |
| LongestCommonSubsequence::getLCS  | 10 + 2 - 3 = 9  | 9 + 2 - 3 = 8   | 11     |
| WordBoggle::getNeighbors          | 12 + 2 - 1 = 13 | 12 + 2 - 1 = 13 | 13     |
| ClosestPair::closestPair          | 12 + 2 - 2 = 12 | 12 + 2 - 2 = 12 | 13     |

The only differences between the two members are the methods “BellmanFord::go” and “LongestCommonSubsequence::getLCS”, which was confirmed by a third member to be VALUE and VALUE respectively.

#### Did all methods (tools vs. manual count) get the same result?

Our tool, Lizard, gave very different results compared to our values calculated by hand. We think that this may be due to the Lizard tool not counting every exit point, and instead only accounts for one exit point.

#### Are the results clear?

They are clear in the sense that the complexity corresponds to the amount of branches and exit points in the methods. However, it is not exactly clear why our results differ from the results from the Lizard tool.

### 2. Are the functions just complex, or also long?

There seems to be a small correlation, with more complex methods having more lines of code. The methods have between 25 and 81 LOC each, with a mean of around 45 LOC. We haven’t worked with large enough codebases to definitively say whether or not this is a lot for these kinds of methods or not.

### 3. What is the purpose of the functions?

The functions are all algorithms, most of which use some form of searching which requires iteration and branching through many loops and conditions, which explains the complexity.

### 4. Are exceptions taken into account in the given measurements?

Yes, the possible exceptions are taken into account by the Lizard complexity measurement tool. This was tested by removing a line that throws an exception, and observing that the measured CC differed from the initially measured value.

If an exception counts as another possible branch, then the CC will increase by one for each exception try-catch block.

### 5. Is the documentation clear w.r.t. all the possible outcomes?

No, not at all. The documentation is very limited, and does not discuss branching.

## Refactoring

### BellmanFord::go

Plan for refactoring complex code: Our plan to refactor this complex code is to create auxiliary functions for specific sub-tasks.

Estimated impact of refactoring (lower CC, but other drawbacks?) : This refactoring considerably lowers the CC of the function by taking it from 13 to 7, which is a 46% decrease. Another advantage is that we can test each sub-function seperately which is easier. However, if an input of a function relies on the output of another, then a change to a previous function could obviously destroy functionality in the second function.

Carried out refactoring (optional, P+): Refactor of the BellmanFord::go function.

Commit link : https://github.com/einbergisak/Assignment3/pull/33/commits/5e163af002e1abeb940a0d9839907794e3dee356

### ValidParentheses::isValid

Plan for refactoring complex code: Our plan to refactor this complex code is to create auxiliary functions for specific sub-tasks.

Estimated impact of refactoring (lower CC, but other drawbacks?) : The refactoring the function reduced the CCN from 14 to 6 which is almost 58%. Another advantage is that we can test each sub-function seperately which is easier. However, if an input of a function relies on the output of another, then a change to a previous function could obviously destroy functionality in the second function.

Carried out refactoring (optional, P+): Refactor of the ValidParentheses::isValid function.

commit link:
https://github.com/einbergisak/Assignment3/commit/14c050ba77b6cd4bc98f7f3c650cb38d108774ac

### BinarySearch2dArray::BinarySearch

Plan for refactoring complex code: Our plan to refactor this complex code is to create auxiliary functions for specific sub-tasks.

Estimated impact of refactoring (lower CC, but other drawbacks?) : This refactoring considerably lowers the CC of the function by taking it from 11 to 4, which is a 64% decrease. Another advantage is that we can test each sub-function seperately which is easier. However, if an input of a function relies on the output of another, then a change to a previous function could obviously destroy functionality in the second function.

Carried out refactoring (optional, P+): Refactor of the BinarySearch2dArray::BinarySearch function.

Commit link : https://github.com/einbergisak/Assignment3/commit/70698b2bfaf131c8d4a4e26d1665088520df2267

### LongestCommonSubsequence::getLCS

Plan for refactoring complex code: create auxiliary functions for a chunk of for loops within the method.

Estimated impact of refactoring: creation of another test case (testing the aux function), breaking the main method by modifying the aux function at a later date,
portability of the aux function (for use in other functions, as it is atomic. This is a positive impact).

Carried out refactoring: yes. CC before refactoring = 11. CC after refactoring = 5. CC reduction of 45%.

Commit link: https://github.com/einbergisak/Assignment3/commit/6eb141374daa4aff3649d519b18477e3c731fda3

## Coverage

### Tools
We used the IntelliJ IDEA code coverage runner for this assignment. Since we are using IntelliJ IDEA as IDE, everything worked smootlhy and it was easy to integrate the coverage tool to our build environment. Indeed, IntelliJ IDEA code coverage runner is well documented, we can find all the tutorials in order to use it in their website : https://www.jetbrains.com/help/idea/code-coverage.html . 

### Your own coverage tool

Show a patch (or link to a branch) that shows the instrumented code to
gather coverage measurements.  
[Group 17 manual coverage example](https://github.com/einbergisak/Assignment3/commit/6a4048aa8fdecf4ac0b057ae8458ab4b834e7813)

What kinds of constructs does your tool support, and how accurate is
its output?

We use a `HashSet` to store keys (`String`s) corresponding to the different branches of a method. This allows us to use a descriptive ID following a numerical structure but not using a number type, to allow for multiple decimal points (to reflect depth of branch).

Regarding ternary operators, the functions which we test do not include any ternary operators, and therefore our coverage tool does not need to explicitly handle it.

### Evaluation

1. How detailed is your coverage measurement?

Not overly detailed. All that is returned is a string, which acts both
as an ID and a flag.  
eg "2.3.1" = 2nd method in the class, 3rd branch, 1st sub-branch.

2. What are the limitations of your own tool?

As we are using a `HashSet`, the insertion order of elements is not preserved.  
This makes understanding the program flow unintuitive.

One advantage of using a `HashSet` is that elements of the same value are only
stored once. This means that when a for loop is entered (and cycled), the resepctive
branch ID is only represented once in the `HashSet`.

3. Are the results of your tool consistent with existing coverage tools?

The output is different. With our tool, we receive information about which
branches were reached, but not the percentage that is covered. It could be
implemented by including a percentage calculation based on
`(amount of branches reached / amount of branches in method) * 100 `, but this does
not seem practical.

## Coverage improvement

Show the comments that describe the requirements for the coverage.

- Report of old coverage: [coverage_before_new_tests/index.html](coverage_before_new_tests/index.html)
- Report of new coverage: [coverage_after_new_tests/index.html](coverage_after_new_tests/index.html)

Test cases added:

- Before new tests:
  - [ValidParentheses::isValid](https://github.com/einbergisak/Assignment3/blob/coverage/src/test/java/com/thealgorithms/strings/ValidParenthesesTest.java)
  - [BinarySearch2dArray::BinarySearch](https://github.com/einbergisak/Assignment3/blob/coverage/src/test/java/com/thealgorithms/searches/BinarySearch2dArrayTest.java)
  - [LongestCommonSubsequence::getLCS](https://github.com/einbergisak/Assignment3/blob/coverage/src/test/java/com/thealgorithms/dynamicprogramming/LongestCommonSubsequenceTest.java)
  - [BellmanFord::go](https://github.com/einbergisak/Assignment3/blob/coverage/src/test/java/com/thealgorithms/datastructures/graphs/BellmanFordTest.java)
- With new tests:
  - [ValidParentheses::isValid](https://github.com/einbergisak/Assignment3/blob/tests/src/test/java/com/thealgorithms/strings/ValidParenthesesTest.java)
  - [BinarySearch2dArray::BinarySearch](https://github.com/einbergisak/Assignment3/blob/tests/src/test/java/com/thealgorithms/searches/BinarySearch2dArrayTest.java)
  - [LongestCommonSubsequence::getLCS](https://github.com/einbergisak/Assignment3/blob/tests/src/test/java/com/thealgorithms/dynamicprogramming/LongestCommonSubsequenceTest.java)
  - [BellmanFord::go](https://github.com/einbergisak/Assignment3/blob/tests/src/test/java/com/thealgorithms/datastructures/graphs/BellmanFordTest.java)

Number of test cases added: four per member (P+) :

- Adam : BellmanFord::go :
  - testGoWithPositiveEdges()
  - testGoWithNegativeEdges()
  - testGoWithNoEdges()
  - testGoWithMultipleSources()
- Gabriel: ValidParentheses::isValid:

  - testFour()
  - testFive()
  - testSix()
  - testSeven()

- Isak : BinarySearch2dArray::BinarySearch :

  - BinarySearch2dArrayTestOneRow()
  - BinarySearch2dArrayTestTargetInMiddle()
  - BinarySearch2dArrayTestTargetAboveMiddleRowInMiddleColumn()
  - BinarySearch2dArrayTestEmptyArray()

- Tillman: LongestCommonSubsequence::getLCS
  - twoDifferentsStrings()
  - oneNullString()
  - oneEmptyString()
  - noSharedCharacters() 
  - twoDifferentStrings() (this is an edge case and does not increase coverage)
  - twoIdenticalStrings() (this is an edge case and does not increase coverage)

## Self-assessment: Way of working

This project challenged us on a few levels.  
We did not fall quickly into a fluid or very efficient way of working and found it difficult to
align on the project requirements and how to split the work up. Additionally, scheduling
commitments reduced our time considerably, which caused extra pressure to produce results.  
This on occasion meant that details were overlooked or assumed to have been understood by all
parties, when in fact they were not.

In terms of tooling, we also ran into some hurdles as our different IDEs handled code coverage
differently - and some not at all without considerable configuration. Because of this we could not
all work with a uniform enviornment, which meant that we needed to rely on individuals to produce
coverage reports. However, thanks to our quality in communication and organisation, we were able
to identify many issues and pitfalls ahead of time.  
It was also challenging to establish a devlopment pipeline with relation to the different
requirements for branches, while also handling the added complexity of the repo being a fork.

Despite the extra pressures we encountered in this project, we feel that each of us were included,
respected, heard and supported through the project and that we feel we gathered learning experience
that will positively contribute to future projects.

In terms of potential improvement, we can look at spending more time at the beginning of the project
to work through the details and make sure we understand what is being asked of us. Despite reducing the
overall programming and documentation time, the process of those tasks may become more efficient and
therefore require less time (and cause less pressure).

Based on what is discussed above, we believe that we are in the "In Place" state. In order to advance to the next state, our tools and practices need to become habitual, and we need to adapt our team and practices to the context of the next assignment. 

Regarding contribution for this assignment, each member implemented the coverage measurement, new tests, and refactoring for one function each. Because of this, we all have contributed approximately the same amount in terms of code changes. The person associated with each function can be seen under "Coverage improvement" above (Isak: BinarySearch2DArray::BinarySearch; Tillman: LongestCommonSubsequence::getLCS; Gabriel: ValidParentheses::isValid; Adam: BellmanFord::go).

Regarding documentation, we all took part in writing the report and answering the questions regarding complexity measurement, project evaluation, onboarding, etc. The workload was well balanced, with each member contributing to the completion of the project.

## Overall experience

This project was definitely the most involved and complex so far. It required us to use tools we had 
not used before and to work with already existing code with the intetion to assess and improve it. This 
presented its own set of design and thought challenges, from which we learnt a lot. We're thankful to have 
learned about code complexity and the implications it can have on a project. This, as well as learning 
how to approach identifying and mitigating these implications (eg refactoring) have been our main take-aways.

Is there something special you want to mention here?

Through this project, and indeed the previous ones as well, we're always pleasently surprised how quickly 
a group can come together to solve problems that at the start appear to be a bit daunting, but which become 
clearer and more achievable as we start to work with it. 
