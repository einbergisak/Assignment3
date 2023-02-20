# Report for assignment 3

This is a template for your report. You are free to modify it as needed.
It is not required to use markdown for your report either, but the report
has to be delivered in a standard, cross-platform format.

## Project

Name: 

URL:

One or two sentences describing it

## Onboarding experience

Did it build and run as documented?

See the assignment for details; if everything works out of the box,
there is no need to write much here. If the first project(s) you picked
ended up being unsuitable, you can describe the "onboarding experience"
for each project, along with reason(s) why you changed to a different one.

## Complexity

### 1. 

#### What are your results for ten complex functions?

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

Plan for refactoring complex code: 

Estimated impact of refactoring (lower CC, but other drawbacks?).

Carried out refactoring (optional, P+):

git diff ...

### BellmanFord::go
Plan for refactoring complex code: Our plan to refactor this complex code is to create auxiliary functions for specific sub-tasks.

Estimated impact of refactoring (lower CC, but other drawbacks?) : This refactoring considerably lower the CC of the function by taking it from 13 to 7, which is a 46% decrease. Another advantage is that we can test each sub-function seperately which is easier. However, if an input of a function relies on the output of another, then a change to a previous function could obviously destroy functionality in the second function.

Carried out refactoring (optional, P+): Refactor of the BellmanFord::go function.

Commit link : https://github.com/einbergisak/Assignment3/pull/33/commits/5e163af002e1abeb940a0d9839907794e3dee356

### ValidParentheses::isValid
Plan for refactoring complex code: Our plan to refactor this complex code is to create auxiliary functions for specific sub-tasks.

Estimated impact of refactoring (lower CC, but other drawbacks?) : The refactoring the function reduced the CCN from 14 to 6 which is almost 58%. Another advantage is that we can test each sub-function seperately which is easier. However, if an input of a function relies on the output of another, then a change to a previous function could obviously destroy functionality in the second function.


Carried out refactoring (optional, P+): Refactor of the ValidParentheses::isValid function.



commit link:
https://github.com/einbergisak/Assignment3/commit/14c050ba77b6cd4bc98f7f3c650cb38d108774ac 
## Coverage

### Tools

Document your experience in using a "new"/different coverage tool.

How well was the tool documented? Was it possible/easy/difficult to
integrate it with your build environment?

### Your own coverage tool

Show a patch (or link to a branch) that shows the instrumented code to
gather coverage measurements.

The patch is probably too long to be copied here, so please add
the git command that is used to obtain the patch instead:

git diff ...

What kinds of constructs does your tool support, and how accurate is
its output?

### Evaluation

1. How detailed is your coverage measurement?

2. What are the limitations of your own tool?

3. Are the results of your tool consistent with existing coverage tools?

## Coverage improvement

Show the comments that describe the requirements for the coverage.

Report of old coverage: [coverage_before_new_tests/index.html](coverage_before_new_tests/index.html)

Report of new coverage: [link]

Test cases added:

git diff ...
- BellmanFord::go : https://github.com/einbergisak/Assignment3/pull/20/commits/494df6d89003bd163fc6dee0ae1d6238d7c81e21
- ValidParentheses::isValid: https://github.com/einbergisak/Assignment3/commit/093a0610ec9831a5807437c8b5f02fab0c5a992a
Number of test cases added: four per member (P+):
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

## Self-assessment: Way of working

Current state according to the Essence standard: ...

Was the self-assessment unanimous? Any doubts about certain items?

How have you improved so far?

Where is potential for improvement?

## Overall experience

What are your main take-aways from this project? What did you learn?

Is there something special you want to mention here?
