Tire Pressure Kata
=================

### Background

Imagine this is some code you have inherited to monitor tire pressure. Now you want to write unit tests for them, and that is harder than it needs to be.
                                                                      
Identify which SOLID principles are not being followed by the code. There is only one class you are interested in writing tests for right now. As a first step, try to get some kind of test in place before you change the class at all. If the tests are hard to write, is that because of the problems with SOLID principles?
                                                                      
When you have some kind of test to lean on, refactor the code and make it testable. 
They could be code you inherited from a legacy code-base. and make it testable. Take care when refactoring not to alter the functionality, or change interfaces which other client code may rely on. (Imagine there is client code in another repository that you can't see right now). Add more tests to cover the functionality of the particular class you've been asked to get under test.

### Your Assignment

Write the unit tests for the Alarm class. The Alarm class is designed to monitor tire pressure and set an alarm if the pressure falls outside of the expected range. The Sensor class provided for the exercise fakes the behaviour of a real tire sensor, providing random but realistic values.

#### Backwards and Forwards

This exercise is adapted from [Emily Bach's Racing Car Kata](https://github.com/emilybache/Racing-Car-Katas). There are four more legacy refactoring kata's in that repo.