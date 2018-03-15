# Context Free Questions
#### Zeng Wei Cheng

##  Who is this programming language for?
Context-free is a external domain specific language designed specifically for artists who have little knowledge in programming. Users of this language can easily get familiar with its syntax or symbols and use it to create art work.


## What is easy to do in this language? Why is it easy?
It is quite easy to generate complex images with just a few lines of code. It creates these complex images by flipping, rotating, skewing, basic shapes including triangles, circles and squares, all of which can be done by a single statement. Moreover, context-free is easy to generate variations; that is, the same piece of code can generate totally different images. And the user of this program can trace back a specific variation by identifying the three-letter-code shown.
It is easy because context-free is a good DSL design, allowing readers to easily understand its meaning with meaning variable names. For example, context-free uses jargons such as skew, hue, and saturate. . .etc. And its syntax is easy too. It uses space to separate and it allows users to switch the places of parameters.


## What is hard to do in this language? Why is it hard?
Because context-free generate pictures by parameters of translate/rotate/scale/skew/flip, it was hard to predict the outcome of the code, especially for new users. Often, as a new user of context-free, I have little idea about what my code will produce until I "render" it. Also, a slight variation in the parameters will lead to totally different outcomes. For example, in this piece of code, the outcome will be very different if I just add 0.1 to the "s" parameter.
```
startshape diamond
rule diamond {
    SQUARE [r 60]
    diamond [ x 0.5 s 0.8]}
```
The outcome will be more unpredictable when involving more complicated variations.
## How did you learn how to program in this language?
I will first read some instructions about the syntax of context-free with Github, and type in example codes to the compiler and see what comes out. Then, I will play it around by modifying the parameters or adding more features to it. When I get a big picture how the codes work, I will then try to write some codes on my own.

## Describe what happens when a ContextFree program runs
_Specifically, how does the computer interpret the rules in a program, in order to turn those rules into a picture?_

The machine starts by a ```startshape``` statement, identifying and running an initial ```rule```. Each rule is like a method, and each of these rules contains statements that draw integrated shapes, by skewing, flipping, and rotating basic shapes like SQUARE[],TRIANGLE[], CIRCLE[]. The user can use recursions or loops to repeat certain actions, thus creating more complicated images. The machine will interpret the codes line by line, and present the corresponding drawing on the broad. In my understanding, this process is done quickly, passing thousands of shapes within a second, thus creating an animation.

## What do you think is interesting about the ContextFree program you wrote?

One thing that is interesting about my code is that it can generate more than 800 thousands shapes in just a few statements. The generated image was completely chaotic, like lots of colorful worms twisting around. And it also looks like those abstract art exhibited in the museums.
