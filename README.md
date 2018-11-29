# SWE-Team17 suggested ReadMe File 


# Development Process


####1: How to make a new branch from scratch

Please consider your directory you are applying these command to 

1. clone the repo on your local machine
```cmd
git clone https://github.com/0abdullah0/SWE-Team17.git 
```
2. change your directory to the repo
```cmd
cd  SWE-Team17/
```
3. create your branch , **BRANCH NAME SHOULD BE THE NAME OF THE FUNCTION** 
```cmd
git checkout -b YOURBRANCHNAME
```

#####2:Starting the Development
1.Create a new class inside the package **Team17**

2. Add all of your logic (functions , variables , ..etc ) inside your class 

2.make an instance in the main in the right places , for example if your function countes the prime numbers then your should search in the switch case statement for the right place and remove the comment and put your class instance 

so for example search for the place in the code 


[![](https://i.imgur.com/l6ZvDwq.png)](https://i.imgur.com/l6ZvDwq.png)

here its case no.8 , so it should be something like this


[![](https://i.imgur.com/04qBPkr.png)](https://i.imgur.com/04qBPkr.png)

and finally add your class to case where it runs all of the functions which **CASE 18**
[![](https://imgur.com/dQetfmP)](https://imgur.com/dQetfmP)

#####3:Makeing a new Pull Request 
after finishing coding , we need to push our code to our branch to make a new pull request
**PLEASE DO NOT ADD ALL FILES TO BE PUSHED CHOOSE ONLY YOUR CLASS AND THE MAIN CLASS **

you can add only your files by getting the modifed files 
```bash
git status 
```
which  returned for me for example 
```bash
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   src/Team17/Main.java
	modified:   src/Team17/NegativeToZero.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	.idea/
	Swe-Project-17.iml
```

so to choose main class and my class only 
```bash
git add -- src/Team17
```

which will add all the changes that was made inside    **src/Team17** directory to be commited 
```bash 
git commit -m  'a breif description of what this commit is for example is it a fix for something or is a new fuction '
```

and at last to push your code 

```bash 
git push origin BRANCHNAME
```
for example --



[![](https://i.imgur.com/v8AAQaR.png)](https://i.imgur.com/v8AAQaR.png)

Then create a new pull request by copying the link in the prev image or go to your branch in github and press on an new pull request 

[![](https://i.imgur.com/DiPY4df.png?1)](https://i.imgur.com/DiPY4df.png?1)

then just put any comments you want and create a pull and wait for review to approve and merge 

