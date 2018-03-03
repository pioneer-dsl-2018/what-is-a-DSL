[Assignment HOWTO]: https://github.com/pioneer-dsl-2018/pioneer-dsl-2018.github.io/wiki/Assignment-HOWTO
[Fowler]: https://app.schoology.com/course/1448538421/materials/gp/1494989781
[markdown]: https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet
[Pulls]: https://github.com/pioneer-dsl-2018/what-is-a-DSL/pulls
[WorldClock1]: https://www.timeanddate.com/worldclock/converter.html?iso=20180313T035900&p1=902&p2=198&p3=516&p4=459
[WorldClock2]: https://www.timeanddate.com/worldclock/converter.html?iso=20180316T035900&p1=902&p2=198&p3=516&p4=459
[Schoology]: https://app.schoology.com/course/1448538421/updates

# What _is_ a DSL?

Here's our first assignment! **Please carefully read all parts of this document
before you start working.**

## Overview and due dates
In this assignment, you'll:
   + Practice using GitHub to work on and submit your assignments.
   + Write a program in an interesting DSL: ContextFree.
   + Read some introductory material about DSLs, which will 
     give us some shared terminology for talking about DSLs and their 
     implementations. 
   + Use what you learned from the reading to understand and critique 
     ContextFree's design.

**These parts of the assignment are due by 
[Monday, March 12 at 8:59pm, Pacific Daylight Time][WorldClock1].** (Click on 
the link to view a world clock that converts to your local time.)

Also, as with all assignments, you'll:
   + Critique each other's work
   + Identify some discussion questions for our next meeting.
     
**The critiques and discussion questions are due by
[Thursday, March 15 at 8:59pm, Pacific Daylight Time][WorldClock2].**

After this assignment, you should be able to:

- Recognize properties of a DSL, and evaluate those properties using common 
terms.
- Write in at least two DSLs (ContextFree and Markdown).
- Use GitHub as a submission system.

### Time spent on the assignment
My goal is for you to spend no more than 8 hours on this assignment (including
critique time). As you work, please keep a rough account of how long you're
spending on the assignment. If it looks like you're going to spend more than
8 hours, please contact me on [Schoology], so we can make adjustments.

### Teamwork
For the technical part of the assignment, you'll work by yourself (though you're
free to discuss the assignment with anyone else in the class, on Schoology). For
the critique part of the assignment, you'll review someone else's work.

## Part 1: Read up on the assignment workflow
[This article][Assignment HOWTO] describes how we'll do our assignments on
GitHub. **Be sure to read it before you start working on your assignment.**

## Part 2: Submit your Coding Bat code and peer-review someone else's code
Practice the assignment workflow by submitting your code for the "nested
parentheses" Coding Bat example. 

You've already forked the repository from the class's GitHub organization, so
now you need to:
   1. Clone it to your own computer.
   1. Modify the code on your own computer so that it contains your solution.
   1. Commit and push your local code back to your GitHub fork.
   1. Submit a pull request from your fork on GitHub.

You don't need to do a peer review on anyone else's code, but feel free to look
at other people's code if you want!

I anticipate that you'll have questions. **Please ask them right away on
[Schoology]!** 

## Part 3: Fork this repository
Now that you've practiced the GitHub workflow, get started on the rest of the
assignment by forking this repository. All the remaining work on this assignment
will be done in your fork.

## Part 4: Write a small program in ContextFree
1. Download ContextFree, a domain-specific language for making art. **You should
download version 2.2**, which is _not_ the current version of the language.
(download links: [Windows](http://www.contextfreeart.org/download/ContextFreeInstall2.2.2.exe), 
[Mac](http://www.contextfreeart.org/download/ContextFree2.2.2.dmg),
[Linux](http://www.contextfreeart.org/download/ContextFreeSource2.2.2.tgz)).
The version 2.2 documentation is 
[here](https://github.com/MtnViewJohn/context-free/wiki/Version-2-Syntax). When you
open ContextFree, it might ask you to update the program; but you should 
ignore that request. Use the old version (2.2) instead.

2. Write an interesting ContextFree program. Save your program in a file called
   `firstname_lastname.cfdg` (where you fill in your first and last names).

3. Export a nice image from your program. (Choose the `Render` menu, then `Save
   Image...`) Use a `.png` extension, so your filename should be `
   firstname_lastname_variant.png` (where `variant` is the three-letter variant
   the uniquely identifies this version of your program).

## Part 5: Read Fowler's introduction to DSLs
Read [Fowler, Chapter 2][Fowler].<sup>1</sup> For the most part, this reading is 
self-contained. In a few places, Fowler references other parts of the book. 
Ignore these references; you can understand the reading without them. It may be 
helpful to know that, in Chapter 1, Fowler described a domain called "Miss 
Grant's Controller". You can safely substitute ContextFree's domain
in place of Miss Grant's Controller. 

_<sup>1</sup> This copy of the reading is for class use only. You should not distribute
 it to anyone outside the class. You should destroy your digital copy when the 
 class is over._


## Part 6: Critique ContextFree
Based on your reading and your use of ContextFree, answer the questions in
`context-free.md`.

## Part 7: Peer review

### Identify your peer-review partner(s)
Your name is on the left side of this table; the person whose work you should
review is on the right side of this table:

| Your name                | Your will critique this person's work |
| ------------------------ | ------------------------------------- |
| Eesha Agarwal            | Wiecheng Zeng                         |
| Chieh-Hsiu (Jerry) Hung  | Yufan (Harry) Liu                     |
| Yufan (Harry) Liu        | Eesha Agarwal                         |
| Wiecheng Zeng            | Chieh-Hsiu (Jerry) Hung               |

### Peer-review your partner's work
Once your partner has submitted, you can comment on their work. You should find
their work linked on the [pull request page][Pulls]. Provide feedback on all
aspects of your partner's work, specifically the information in
`context-free.md`, their code, and their image. Here are some questions you
might consider / answer when providing feedback:

- Do you agree or disagree with your partner's claims in `context-free.md`? Why?
- If your partner has raised a question in `context-free.md`,
try to answer it!
- Did your partner describe anything that you also experienced? For example, did
you try to do something in ContextFree that was difficult?
- Did you learn any cool language features (from ContextFree or Markdown) that
might add to your partner's work?

## Part 8: Discussion questions
Respond to the prompts in `discussion-questions.md`, by editing that file.

## Grading
Good responses (i.e., responses that receive a B) will:

   + fully respond to every prompt in the starter file, _and_
   + be well-written and easy to read, i.e., clear yet concise using good 
   spelling, grammar, organization, and proper formatting, to convey a 
   well-formed idea, _and_
   + where appropriate, support your thoughts with references to material from
   the reading or from language documentation.

Great responses (i.e., responses that receive an A) will additionally:

   + be particularly insightful, by using concepts from the reading to classify
   aspects of each DSL in the assignment and / or by disagreeing with the
   classification that Fowler might make and by presenting a strong argument for
   a different classification.

## Tasks

- [ ] Read the [Assignment HOWTO].
- [ ] Submit a pull request for your Coding Bat code.
- [ ] Write a ContextFree program in `firstname_lastname.cfdg`.
- [ ] Make and save a nice picture in `firstname_lastname_variant.png`.
- [ ] Read Fowler's [introduction to DSLs][Fowler].
- [ ] Answer the questions in `context-free.md`.
- [ ] Submit a pull request for this assignment.
- [ ] Comment on your critique partner's work.
- [ ] Respond to the prompts in `discussion-questions.md`.
