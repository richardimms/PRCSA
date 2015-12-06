# Welcome to the PRCS205 Group A Repository! #

* A second year computer science group project at Plymouth University, called the Integrating Project. 
* Version 0.33

## General git Commands##
Every time you have added or made changes to files or folders in your git workspace, you should type: 
```
$ git status
```
N.B. Ignore the $ sign - notation for a new command line. 

This should highlight any changes in red. Remember, if a tracked file is currently open, you may see a compiled version of it. Ensure nothing like this is added. 

When a new file has been added to the workspace, you need to type:
```
$ git add path/to/new/file
```
for all added files or folders.

If it is simply updates to already existing files, you need only type: 
```
$ git add -u
```
or if you have removed old files, you need to type:
```
$ git rm path/to/file
```
Then, commit and push your changes as normal:
```
$ git commit -m "My message"
$ git push -u origin master

```
To configure both your username and password, use the following commands:
```
$ git config --global user.name "FIRST_NAME LAST_NAME"
$ git config --global user.email "MY_NAME@example.com"
```

## Contributors ##

* Philip Edwards           (philip.edwards@students.plymouth.ac.uk)
* Richard Imms            (richard.imms@students.plymouth.ac.uk)
* Brian Viviers              (brian.viviers@students.plymouth.ac.uk)
* Dominic Youel           (dominic.youel@students.plymouth.ac.uk)

##Deadlines##
**Initial Planning Document** Thursday, 29 January 2015, 12:00 PM

**HCI Usability Report** Thursday, 19 March 2015, 12:00 PM

**Final Submission** Thursday, 23 April 2015, 12:00 PM