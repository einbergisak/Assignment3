# Report for assignment 3

This is a template for your report. You are free to modify it as needed.
It is not required to use markdown for your report either, but the report
has to be delivered in a standard, cross-platform format.

## Project

Name:

URL:

One or two sentences describing it

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

1. What are your results for ten complex functions?
   - Did all methods (tools vs. manual count) get the same result?
   - Are the results clear?
2. Are the functions just complex, or also long?
3. What is the purpose of the functions?
4. Are exceptions taken into account in the given measurements?
5. Is the documentation clear w.r.t. all the possible outcomes?

## Refactoring

Plan for refactoring complex code:

Estimated impact of refactoring (lower CC, but other drawbacks?).

Carried out refactoring (optional, P+):

git diff ...

## Coverage

### Tools

Document your experience in using a "new"/different coverage tool.

How well was the tool documented? Was it possible/easy/difficult to
integrate it with your build environment?

### Your own coverage tool

Show a patch (or link to a branch) that shows the instrumented code to
gather coverage measurements.  
[Group 17 manual coverage example](https://github.com/einbergisak/Assignment3/commit/6a4048aa8fdecf4ac0b057ae8458ab4b834e7813)

What kinds of constructs does your tool support, and how accurate is
its output?

We use a `HashSet` and fill it with ID's of type `string`. The output is therefore quite accurate, 
as we're using strings (resembling a duple notation), but not duples themselves (which can suffer from 
rounding issues).

### Evaluation

1. How detailed is your coverage measurement?

Not overly detailed. All that is returned is a string, which acts both
as an ID and a flag.  
eg "2.3.1" = 2nd method in the class, 3rd branch, 1st sub-branch.

2. What are the limitations of your own tool?

As we are using a `HashSet`, the insertion order of elements is not preserved.  
This makes understanding the program flow unintuative.

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

Report of old coverage: [link]

Report of new coverage: [link]

Test cases added:

git diff ...

Number of test cases added: two per team member (P) or at least four (P+).

## Self-assessment: Way of working

Current state according to the Essence standard: ...

Was the self-assessment unanimous? Any doubts about certain items?

How have you improved so far?

Where is potential for improvement?

## Overall experience

What are your main take-aways from this project? What did you learn?

Is there something special you want to mention here?
