package com.vickysg.quizforprogrammers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.vickysg.quizforprogrammers.TriviaQuizContract.*;

import java.util.ArrayList;

public class TriviaQuizHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "ProgrammingQuiz.db";
    private static final int DATBASE_VERSION = 3;

    private SQLiteDatabase db;


    TriviaQuizHelper(Context context) {
        super(context, DATABASE_NAME,null, DATBASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_QUESTION + " TEXT, " +
                QuestionTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionTable.COLUMN_ANSWER_NR + " TEXT, " +
                QuestionTable.COLUMN_CATEGORY + " TEXT, " +
                QuestionTable.COLUMN_LEVELS_ID + " INTEGER " +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);

    }


    private void fillQuestionsTable()
    {

        TriviaQuestion q1 = new TriviaQuestion("Which of the following is not a Java features?","Dynamic","Use Of Pointers","Class","Object Oriented","Use Of Pointers"
                ,TriviaQuestion.CATEGORY_JAVA,1);
        addQuestions(q1);

        TriviaQuestion q2 = new TriviaQuestion("The \\u0021 article referred to as a","Unicode escape sequence","Octal escape","Hexadecimal","Line Feed","Unicode escape sequence"
                ,TriviaQuestion.CATEGORY_JAVA,1);
        addQuestions(q2);

        TriviaQuestion q3= new TriviaQuestion("_____ is used to find and fix bugs in the Java programs.","JVM","JRE","JDK","JDB","JDB"
                ,TriviaQuestion.CATEGORY_JAVA,1);
        addQuestions(q3);

        TriviaQuestion q4= new TriviaQuestion("What is the return type of the hashCode() method in the Object class?","Object","int","long","void","int"
                ,TriviaQuestion.CATEGORY_JAVA,1);
        addQuestions(q4);

        TriviaQuestion q5= new TriviaQuestion("What does the expression float a = 35 / 0 return?","0","not a number","infinity","run time exception ","infinity"
                ,TriviaQuestion.CATEGORY_JAVA,1);
        addQuestions(q5);

        TriviaQuestion q6= new TriviaQuestion("Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?","javap tool","javaw command","javadoc tool","javah command","javadoc tool"
                ,TriviaQuestion.CATEGORY_JAVA,1);
        addQuestions(q6);




        TriviaQuestion q11 = new TriviaQuestion("Which method of the Class.class is used to determine the name of a class represented by the class object as a String?","getClass","intern","getName","toString","getName"
                ,TriviaQuestion.CATEGORY_JAVA,2);
        addQuestions(q11);

        TriviaQuestion q12 = new TriviaQuestion("In which process, a local variable has the same name as one of the instance variables?","Serialization","Variable Shadowing","Abstraction","Multi-threading","Variable Shadowing"
                ,TriviaQuestion.CATEGORY_JAVA,2);
        addQuestions(q12);

        TriviaQuestion q13= new TriviaQuestion("Which of the following is an immediate subclass of the Panel class?","Applet class","Window Class","Frame Class","Dialog Class","Applet class"
                ,TriviaQuestion.CATEGORY_JAVA,2);
        addQuestions(q13);

        TriviaQuestion q14= new TriviaQuestion("Which of the following is not a computer language?","BASIC","FORTRAN","LOUTS","COBOL","LOUTS"
                ,TriviaQuestion.CATEGORY_JAVA,2);
        addQuestions(q14);

        TriviaQuestion q15= new TriviaQuestion("The third generation computers were made with ?","Bio Chips ","Transistors","Integrated Circuits","Vacuum Tubes ","Integrated Circuits"
                ,TriviaQuestion.CATEGORY_JAVA,2);
        addQuestions(q15);

        TriviaQuestion q16= new TriviaQuestion("The first page displayed by Web browser after opening a Web site is called ?","Home page","Browser page","Search page  ","Bookmark","Home page"
                ,TriviaQuestion.CATEGORY_JAVA,2);
        addQuestions(q16);


        TriviaQuestion q111 = new TriviaQuestion("Which of the following is a marker interface?","Runnable","Remote","Readable","Result","Remote"
            ,TriviaQuestion.CATEGORY_JAVA,3);
        addQuestions(q111);

        TriviaQuestion q112 = new TriviaQuestion("Which keyword is used for accessing the features of a package?","Package","import","extends","export","import"
                ,TriviaQuestion.CATEGORY_JAVA,3);
        addQuestions(q112);

        TriviaQuestion q113= new TriviaQuestion("Which of the following is a reserved keyword in Java?","object","strictfp","main","system","strictfp"
                ,TriviaQuestion.CATEGORY_JAVA,3);
        addQuestions(q113);

        TriviaQuestion q114= new TriviaQuestion("Which of the following modifiers can be used for a variable so that it can be accessed by any thread or a part of a program?","global","transient","volatile","default","volatile"
                ,TriviaQuestion.CATEGORY_JAVA,3);
        addQuestions(q114);

        TriviaQuestion q115= new TriviaQuestion("If three threads trying to share a single object at the same time, which condition will arise in this scenario?","time-lapse ","Critical situation","Race Condition","Recursion","Race Condition"
                ,TriviaQuestion.CATEGORY_JAVA,3);
        addQuestions(q115);

        TriviaQuestion q116= new TriviaQuestion("The first page displayed by Web browser after opening a Web site is called ?","Home page","Browser page","Search page  ","Bookmark","Home page"
                ,TriviaQuestion.CATEGORY_JAVA,3);
        addQuestions(q116);




        TriviaQuestion q44 = new TriviaQuestion("Which method of the Class.class is used to determine the name of a class represented by the class object as a String?","getClass","intern","getName","toString","getName"
                ,TriviaQuestion.CATEGORY_JAVA,4);
        addQuestions(q44);

        TriviaQuestion q45 = new TriviaQuestion("In which process, a local variable has the same name as one of the instance variables?","Serialization","Variable Shadowing","Abstraction","Multi-threading","Variable Shadowing"
                ,TriviaQuestion.CATEGORY_JAVA,4);
        addQuestions(q45);

        TriviaQuestion q46= new TriviaQuestion("Which of the following is an immediate subclass of the Panel class?","Applet class","Window Class","Frame Class","Dialog Class","Applet class"
                ,TriviaQuestion.CATEGORY_JAVA,4);
        addQuestions(q46);

        TriviaQuestion q47= new TriviaQuestion("Which of the following is not a computer language?","BASIC","FORTRAN","LOUTS","COBOL","LOUTS"
                ,TriviaQuestion.CATEGORY_JAVA,4);
        addQuestions(q47);

        TriviaQuestion q48= new TriviaQuestion("The third generation computers were made with ?","Bio Chips ","Transistors","Integrated Circuits","Vacuum Tubes ","Integrated Circuits"
                ,TriviaQuestion.CATEGORY_JAVA,4);
        addQuestions(q48);

        TriviaQuestion q49= new TriviaQuestion("The first page displayed by Web browser after opening a Web site is called ?","Home page","Browser page","Search page  ","Bookmark","Home page"
                ,TriviaQuestion.CATEGORY_JAVA,4);
        addQuestions(q49);



        TriviaQuestion q105 = new TriviaQuestion("Which of the following is not a Java features?","Dynamic","Use Of Pointers","Class","Object Oriented","Use Of Pointers"
                ,TriviaQuestion.CATEGORY_JAVA,5);
        addQuestions(q105);

        TriviaQuestion q205 = new TriviaQuestion("The \\u0021 article referred to as a","Unicode escape sequence","Octal escape","Hexadecimal","Line Feed","Unicode escape sequence"
                ,TriviaQuestion.CATEGORY_JAVA,5);
        addQuestions(q205);

        TriviaQuestion q305= new TriviaQuestion("_____ is used to find and fix bugs in the Java programs.","JVM","JRE","JDK","JDB","JDB"
                ,TriviaQuestion.CATEGORY_JAVA,5);
        addQuestions(q305);

        TriviaQuestion q405= new TriviaQuestion("What is the return type of the hashCode() method in the Object class?","Object","int","long","void","int"
                ,TriviaQuestion.CATEGORY_JAVA,5);
        addQuestions(q405);

        TriviaQuestion q505= new TriviaQuestion("What does the expression float a = 35 / 0 return?","0","not a number","infinity","run time exception ","infinity"
                ,TriviaQuestion.CATEGORY_JAVA,5);
        addQuestions(q505);

        TriviaQuestion q605= new TriviaQuestion("Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?","javap tool","javaw command","javadoc tool","javah command","javadoc tool"
                ,TriviaQuestion.CATEGORY_JAVA,5);
        addQuestions(q605);



        TriviaQuestion q1111 = new TriviaQuestion("Which of the following is a marker interface?","Runnable","Remote","Readable","Result","Remote"
                ,TriviaQuestion.CATEGORY_JAVA,6);
        addQuestions(q1111);

        TriviaQuestion q1121 = new TriviaQuestion("Which keyword is used for accessing the features of a package?","Package","import","extends","export","import"
                ,TriviaQuestion.CATEGORY_JAVA,6);
        addQuestions(q1121);

        TriviaQuestion q1131= new TriviaQuestion("Which of the following is a reserved keyword in Java?","object","strictfp","main","system","strictfp"
                ,TriviaQuestion.CATEGORY_JAVA,6);
        addQuestions(q1131);

        TriviaQuestion q1141= new TriviaQuestion("Which of the following modifiers can be used for a variable so that it can be accessed by any thread or a part of a program?","global","transient","volatile","default","volatile"
                ,TriviaQuestion.CATEGORY_JAVA,6);
        addQuestions(q1141);

        TriviaQuestion q1151= new TriviaQuestion("If three threads trying to share a single object at the same time, which condition will arise in this scenario?","time-lapse ","Critical situation","Race Condition","Recursion","Race Condition"
                ,TriviaQuestion.CATEGORY_JAVA,6);
        addQuestions(q1151);

        TriviaQuestion q1161= new TriviaQuestion("The first page displayed by Web browser after opening a Web site is called ?","Home page","Browser page","Search page  ","Bookmark","Home page"
                ,TriviaQuestion.CATEGORY_JAVA,6);
        addQuestions(q1161);



        TriviaQuestion q27= new TriviaQuestion(" Kotlin is developed by?","Adobe","Google","JetBrains","Facebook","JetBrains"
                ,TriviaQuestion.CATEGORY_KOTLIN,1);
        addQuestions(q27);

        TriviaQuestion q28= new TriviaQuestion("Is Kotlin backward-compatible?","Yes","No","Other","both","Yes"
                ,TriviaQuestion.CATEGORY_KOTLIN,1);
        addQuestions(q28);

        TriviaQuestion q29= new TriviaQuestion("How to make a multi lined comment in Kotlin?","/","//","/*  */","None of these","/*  */"
                ,TriviaQuestion.CATEGORY_KOTLIN,1);
        addQuestions(q29);

        TriviaQuestion q10= new TriviaQuestion(" Which file extension is used to save Kotlin files.",".kat",".kot",".kt or .kts",".java",".kt or .kts"
                ,TriviaQuestion.CATEGORY_KOTLIN,1);
        addQuestions(q10);

        TriviaQuestion q121= new TriviaQuestion("Which of these is used to handle null exceptions in kotlin?","Range","Sealed Class","Elvis Operator","Lambda Function","Elvis Operator"
                ,TriviaQuestion.CATEGORY_KOTLIN,1);
        addQuestions(q121);

        TriviaQuestion q122= new TriviaQuestion("Speed of internet connection is measured in","GHz","dpi","ppm","Gbps","Gbps"
                ,TriviaQuestion.CATEGORY_KOTLIN,1);
        addQuestions(q122);




        TriviaQuestion q2b7= new TriviaQuestion("What is the default behavior of Kotlin classes?","All Classes are Public","All Classes are Final","All Classes are Sealed","All are Correct","All Classes are Final"
                ,TriviaQuestion.CATEGORY_KOTLIN,2);
        addQuestions(q2b7);

        TriviaQuestion q2b8= new TriviaQuestion("What is the default visibility modifier?","public","internal","private","protected","public"
                ,TriviaQuestion.CATEGORY_KOTLIN,2);
        addQuestions(q2b8);

        TriviaQuestion q2b9= new TriviaQuestion("Who is the inventor of www?","Bill Gates","Tim Berners-Lee","Timothy Bil","Ray Tomlinson","Tim Berners-Lee"
                ,TriviaQuestion.CATEGORY_KOTLIN,2);
        addQuestions(q2b9);

        TriviaQuestion q1b0= new TriviaQuestion("what kinds of programming types does Kotlin support?","Oops","procedural programming","both","none of these","both"
                ,TriviaQuestion.CATEGORY_KOTLIN,2);
        addQuestions(q1b0);

        TriviaQuestion q12b1= new TriviaQuestion("Can we migrate code from Java to Kotlin?","Yes","No","Never","None of these","Yes"
                ,TriviaQuestion.CATEGORY_KOTLIN,2);
        addQuestions(q12b1);

        TriviaQuestion q12b2= new TriviaQuestion(" How many constructors are available in Kotlin?","1","2","3","4","2"
                ,TriviaQuestion.CATEGORY_KOTLIN,2);
        addQuestions(q12b2);



        TriviaQuestion q2b17= new TriviaQuestion("we can divide Kotlin Functions into ......... types.","4","3","2","1","2"
                ,TriviaQuestion.CATEGORY_KOTLIN,3);
        addQuestions(q2b17);

        TriviaQuestion q2b18= new TriviaQuestion("What are the basic data types in Kotlin?","characters","number and strings","boolean and arrays","All are Correct","All are Correct"
                ,TriviaQuestion.CATEGORY_KOTLIN,3);
        addQuestions(q2b18);

        TriviaQuestion q2b19= new TriviaQuestion("How do you get the length of a string in Kotlin?","strlen","str.length","str.lenghtOf","other","str.length"
                ,TriviaQuestion.CATEGORY_KOTLIN,3);
        addQuestions(q2b19);

        TriviaQuestion q1b10= new TriviaQuestion("Which of following targets currently not supported by Kotlin?","LLVM","NET CLR","JAVASCRIPT","NO-ONE","NET CLR"
                ,TriviaQuestion.CATEGORY_KOTLIN,3);
        addQuestions(q1b10);

        TriviaQuestion q12b11= new TriviaQuestion("HTML is used to create","Operating System","High Level Program","Web-Server","Web Page","Web Page"
                ,TriviaQuestion.CATEGORY_KOTLIN,3);
        addQuestions(q12b11);

        TriviaQuestion q12b12= new TriviaQuestion(" Does Kotlin allow macros?","Yes","No","Always","None of these","No"
                ,TriviaQuestion.CATEGORY_KOTLIN,3);
        addQuestions(q12b12);



        TriviaQuestion q2b71= new TriviaQuestion("What is the default behavior of Kotlin classes?","All Classes are Public","All Classes are Final","All Classes are Sealed","All are Correct","All Classes are Final"
                ,TriviaQuestion.CATEGORY_KOTLIN,4);
        addQuestions(q2b71);

        TriviaQuestion q2b81= new TriviaQuestion("What is the default visibility modifier?","public","internal","private","protected","public"
                ,TriviaQuestion.CATEGORY_KOTLIN,4);
        addQuestions(q2b81);

        TriviaQuestion q2b91= new TriviaQuestion("Who is the inventor of www?","Bill Gates","Tim Berners-Lee","Timothy Bil","Ray Tomlinson","Tim Berners-Lee"
                ,TriviaQuestion.CATEGORY_KOTLIN,4);
        addQuestions(q2b91);

        TriviaQuestion q1b01= new TriviaQuestion("what kinds of programming types does Kotlin support?","Oops","procedural programming","both","none of these","both"
                ,TriviaQuestion.CATEGORY_KOTLIN,4);
        addQuestions(q1b01);

        TriviaQuestion q12b111= new TriviaQuestion("Can we migrate code from Java to Kotlin?","Yes","No","Never","None of these","Yes"
                ,TriviaQuestion.CATEGORY_KOTLIN,4);
        addQuestions(q12b111);

        TriviaQuestion q12b21= new TriviaQuestion(" How many constructors are available in Kotlin?","1","2","3","4","2"
                ,TriviaQuestion.CATEGORY_KOTLIN,4);
        addQuestions(q12b21);





        TriviaQuestion q271= new TriviaQuestion(" Kotlin is developed by?","Adobe","Google","JetBrains","Facebook","JetBrains"
                ,TriviaQuestion.CATEGORY_KOTLIN,5);
        addQuestions(q271);

        TriviaQuestion q281= new TriviaQuestion("Is Kotlin backward-compatible?","Yes","No","Other","both","Yes"
                ,TriviaQuestion.CATEGORY_KOTLIN,5);
        addQuestions(q281);

        TriviaQuestion q291= new TriviaQuestion("How to make a multi lined comment in Kotlin?","/","//","/*  */","None of these","/*  */"
                ,TriviaQuestion.CATEGORY_KOTLIN,5);
        addQuestions(q291);

        TriviaQuestion q101= new TriviaQuestion(" Which file extension is used to save Kotlin files.",".kat",".kot",".kt or .kts",".java",".kt or .kts"
                ,TriviaQuestion.CATEGORY_KOTLIN,5);
        addQuestions(q101);

        TriviaQuestion q12112= new TriviaQuestion("Which of these is used to handle null exceptions in kotlin?","Range","Sealed Class","Elvis Operator","Lambda Function","Elvis Operator"
                ,TriviaQuestion.CATEGORY_KOTLIN,5);
        addQuestions(q12112);

        TriviaQuestion q1221= new TriviaQuestion("Speed of internet connection is measured in","GHz","dpi","ppm","Gbps","Gbps"
                ,TriviaQuestion.CATEGORY_KOTLIN,5);
        addQuestions(q1221);



        TriviaQuestion q2b171= new TriviaQuestion("we can divide Kotlin Functions into ......... types.","4","3","2","1","2"
                ,TriviaQuestion.CATEGORY_KOTLIN,6);
        addQuestions(q2b171);

        TriviaQuestion q2b181= new TriviaQuestion("What are the basic data types in Kotlin?","characters","number and strings","boolean and arrays","All are Correct","All are Correct"
                ,TriviaQuestion.CATEGORY_KOTLIN,6);
        addQuestions(q2b181);

        TriviaQuestion q2b191= new TriviaQuestion("How do you get the length of a string in Kotlin?","strlen","str.length","str.lenghtOf","other","str.length"
                ,TriviaQuestion.CATEGORY_KOTLIN,6);
        addQuestions(q2b191);

        TriviaQuestion q1b101= new TriviaQuestion("Which of following targets currently not supported by Kotlin?","LLVM","NET CLR","JAVASCRIPT","NO-ONE","NET CLR"
                ,TriviaQuestion.CATEGORY_KOTLIN,6);
        addQuestions(q1b101);

        TriviaQuestion q12b113= new TriviaQuestion("HTML is used to create","Operating System","High Level Program","Web-Server","Web Page","Web Page"
                ,TriviaQuestion.CATEGORY_KOTLIN,6);
        addQuestions(q12b113);

        TriviaQuestion q12b121= new TriviaQuestion(" Does Kotlin allow macros?","Yes","No","Always","None of these","No"
                ,TriviaQuestion.CATEGORY_KOTLIN,6);
        addQuestions(q12b121);




        TriviaQuestion a = new TriviaQuestion(" What is the maximum possible length of an identifier?","16","32","64","None of these","None of these"
                ,TriviaQuestion.CATEGORY_PYTHON,6);
        addQuestions(a);

        TriviaQuestion b = new TriviaQuestion("In which year was the Python language developed?","1995","1989","1972","1981","1989"
                ,TriviaQuestion.CATEGORY_PYTHON,6);
        addQuestions(b);

        TriviaQuestion c = new TriviaQuestion("In which language is Python written?","English","Java","C","None of these","C"
                ,TriviaQuestion.CATEGORY_PYTHON,6);
        addQuestions(c);

        TriviaQuestion d = new TriviaQuestion("Which one of the following is the correct extension of the Python file?",".py",".python",".p","None of these",".py"
                ,TriviaQuestion.CATEGORY_PYTHON,6);
        addQuestions(d);

        TriviaQuestion f = new TriviaQuestion("In which year was the Python 3.0 version developed?","2007","2009","2008","2010","2008"
                ,TriviaQuestion.CATEGORY_PYTHON,6);
        addQuestions(f);

        TriviaQuestion g = new TriviaQuestion("What do we use to define a block of code in Python language?","key","brackets","indentation","None of these","indentation"
                ,TriviaQuestion.CATEGORY_PYTHON,6);
        addQuestions(g);


        TriviaQuestion a1 = new TriviaQuestion("Which character is used in Python to make a single line comment?","#","/","//","!","#"
                ,TriviaQuestion.CATEGORY_PYTHON,5);
        addQuestions(a1);

        TriviaQuestion b1 = new TriviaQuestion("What is the method inside the class in python language?","Object","Function","Attribute","Argument","Function"
                ,TriviaQuestion.CATEGORY_PYTHON,5);
        addQuestions(b1);

        TriviaQuestion c1 = new TriviaQuestion("Which of the following is not a keyword in Python language?","val","raise","try","with","val"
                ,TriviaQuestion.CATEGORY_PYTHON,5);
        addQuestions(c1);

        TriviaQuestion d1 = new TriviaQuestion("Which one of the following has the highest precedence in the expression?","Division","Subtraction","Power","Parentheses","Parentheses"
                ,TriviaQuestion.CATEGORY_PYTHON,5);
        addQuestions(d1);

        TriviaQuestion f1 = new TriviaQuestion(" Which of the following functions is a built-in function in python language?","scanf","print","printf","val","print"
                ,TriviaQuestion.CATEGORY_PYTHON,5);
        addQuestions(f1);

        TriviaQuestion g1 = new TriviaQuestion(" round(4.576)  What will be the output of this function?","4","5","576","6","5"
                ,TriviaQuestion.CATEGORY_PYTHON,5);
        addQuestions(g1);


        TriviaQuestion a11 = new TriviaQuestion("How many keywords present in the python programming language?","32","22","33","27","33"
                ,TriviaQuestion.CATEGORY_PYTHON,4);
        addQuestions(a11);

        TriviaQuestion b11 = new TriviaQuestion("How many control statements python supports?","1","3","2","4","3"
                ,TriviaQuestion.CATEGORY_PYTHON,4);
        addQuestions(b11);

        TriviaQuestion c11 = new TriviaQuestion("Which of the following arithmetic operators cannot be used with strings in python?","+","*","-","All are Correct","-"
                ,TriviaQuestion.CATEGORY_PYTHON,4);
        addQuestions(c11);

        TriviaQuestion d11 = new TriviaQuestion("Which of the following keywords is used for function declaration in Python language?","def","func","define","function name","def"
                ,TriviaQuestion.CATEGORY_PYTHON,4);
        addQuestions(d11);

        TriviaQuestion f11 = new TriviaQuestion("When a user does not use the return statement inside a function in Python, what will return the function in that case.","0","1","None","No Output","None"
                ,TriviaQuestion.CATEGORY_PYTHON,4);
        addQuestions(f11);

        TriviaQuestion g11 = new TriviaQuestion("Which of the following blocks allows you to test the code blocks for errors?","except block","try block","finally block","None of these","try block"
                ,TriviaQuestion.CATEGORY_PYTHON,4);
        addQuestions(g11);


        TriviaQuestion a3 = new TriviaQuestion(" What is the maximum possible length of an identifier?","16","32","64","None of these","None of these"
                ,TriviaQuestion.CATEGORY_PYTHON,3);
        addQuestions(a3);

        TriviaQuestion b3 = new TriviaQuestion("In which year was the Python language developed?","1995","1989","1972","1981","1989"
                ,TriviaQuestion.CATEGORY_PYTHON,3);
        addQuestions(b3);

        TriviaQuestion c3 = new TriviaQuestion("In which language is Python written?","English","Java","C","None of these","C"
                ,TriviaQuestion.CATEGORY_PYTHON,3);
        addQuestions(c3);

        TriviaQuestion d3 = new TriviaQuestion("Which one of the following is the correct extension of the Python file?",".py",".python",".p","None of these",".py"
                ,TriviaQuestion.CATEGORY_PYTHON,3);
        addQuestions(d3);

        TriviaQuestion f3 = new TriviaQuestion("In which year was the Python 3.0 version developed?","2007","2009","2008","2010","2008"
                ,TriviaQuestion.CATEGORY_PYTHON,3);
        addQuestions(f3);

        TriviaQuestion g3 = new TriviaQuestion("What do we use to define a block of code in Python language?","key","brackets","indentation","None of these","indentation"
                ,TriviaQuestion.CATEGORY_PYTHON,3);
        addQuestions(g3);


        TriviaQuestion a112 = new TriviaQuestion("How many keywords present in the python programming language?","32","22","33","27","33"
                ,TriviaQuestion.CATEGORY_PYTHON,2);
        addQuestions(a112);

        TriviaQuestion b112 = new TriviaQuestion("How many control statements python supports?","1","3","2","4","3"
                ,TriviaQuestion.CATEGORY_PYTHON,2);
        addQuestions(b112);

        TriviaQuestion c112 = new TriviaQuestion("Which of the following arithmetic operators cannot be used with strings in python?","+","*","-","All are Correct","-"
                ,TriviaQuestion.CATEGORY_PYTHON,2);
        addQuestions(c112);

        TriviaQuestion d112 = new TriviaQuestion("Which of the following keywords is used for function declaration in Python language?","def","func","define","function name","def"
                ,TriviaQuestion.CATEGORY_PYTHON,2);
        addQuestions(d112);

        TriviaQuestion f112 = new TriviaQuestion("When a user does not use the return statement inside a function in Python, what will return the function in that case.","0","1","None","No Output","None"
                ,TriviaQuestion.CATEGORY_PYTHON,2);
        addQuestions(f112);

        TriviaQuestion g112 = new TriviaQuestion("Which of the following blocks allows you to test the code blocks for errors?","except block","try block","finally block","None of these","try block"
                ,TriviaQuestion.CATEGORY_PYTHON,2);
        addQuestions(g112);


        TriviaQuestion a111 = new TriviaQuestion("Which character is used in Python to make a single line comment?","#","/","//","!","#"
                ,TriviaQuestion.CATEGORY_PYTHON,1);
        addQuestions(a111);

        TriviaQuestion b111 = new TriviaQuestion("What is the method inside the class in python language?","Object","Function","Attribute","Argument","Function"
                ,TriviaQuestion.CATEGORY_PYTHON,1);
        addQuestions(b111);

        TriviaQuestion c15 = new TriviaQuestion("Which of the following is not a keyword in Python language?","val","raise","try","with","val"
                ,TriviaQuestion.CATEGORY_PYTHON,1);
        addQuestions(c15);

        TriviaQuestion d15 = new TriviaQuestion("Which one of the following has the highest precedence in the expression?","Division","Subtraction","Power","Parentheses","Parentheses"
                ,TriviaQuestion.CATEGORY_PYTHON,1);
        addQuestions(d15);

        TriviaQuestion f15 = new TriviaQuestion(" Which of the following functions is a built-in function in python language?","scanf","print","printf","val","print"
                ,TriviaQuestion.CATEGORY_PYTHON,1);
        addQuestions(f15);

        TriviaQuestion g15 = new TriviaQuestion(" round(4.576)  What will be the output of this function?","4","5","576","6","5"
                ,TriviaQuestion.CATEGORY_PYTHON,1);
        addQuestions(g15);



    }

    private void addQuestions(TriviaQuestion question){

        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_QUESTION,question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION1,question.getOption1());
        cv.put(QuestionTable.COLUMN_OPTION2,question.getOption2());
        cv.put(QuestionTable.COLUMN_OPTION3,question.getOption3());
        cv.put(QuestionTable.COLUMN_OPTION4,question.getOption4());
        cv.put(QuestionTable.COLUMN_ANSWER_NR,question.getAnswerNr());
        cv.put(QuestionTable.COLUMN_CATEGORY,question.getCategory());
        cv.put(QuestionTable.COLUMN_LEVELS_ID,question.getLevels());
        db.insert(QuestionTable.TABLE_NAME,null,cv);

    }

    public ArrayList<TriviaQuestion> getAllQuestions() {

        ArrayList<TriviaQuestion> questionList = new ArrayList<>();
        db = getReadableDatabase();



        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR
        };



            Cursor c = db.query(QuestionTable.TABLE_NAME,
                    Projection,
                    null,
                    null,
                    null,
                    null,
                    null);


            if (c.moveToFirst()) {
                do {

                    TriviaQuestion question = new TriviaQuestion();
                    question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                    question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                    question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                    question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                    question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                    question.setAnswerNr(c.getString(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));

                    questionList.add(question);

                } while (c.moveToNext());

            }
            c.close();
            return questionList;
        }

    public ArrayList<TriviaQuestion> getQuestionsWithCategory(String Category) {

        ArrayList<TriviaQuestion> questionList = new ArrayList<>();
        db = getReadableDatabase();



        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR,
                QuestionTable.COLUMN_CATEGORY
        };

        String selection = QuestionTable.COLUMN_CATEGORY + " = ? ";
        String selectionArgs[] = {Category};


        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                selection,
                selectionArgs,
                null,
                null,
                null);


        if (c.moveToFirst()) {
            do {

                TriviaQuestion question = new TriviaQuestion();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getString(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setCategory(c.getString(c.getColumnIndex(QuestionTable.COLUMN_CATEGORY)));

                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;
    }


    public ArrayList<TriviaQuestion> getQuestionsByLevelsAndCategory(String Category, int LevelsID) {

        ArrayList<TriviaQuestion> questionList = new ArrayList<>();
        db = getReadableDatabase();



        String Projection[] = {

                QuestionTable._ID,
                QuestionTable.COLUMN_QUESTION,
                QuestionTable.COLUMN_OPTION1,
                QuestionTable.COLUMN_OPTION2,
                QuestionTable.COLUMN_OPTION3,
                QuestionTable.COLUMN_OPTION4,
                QuestionTable.COLUMN_ANSWER_NR,
                QuestionTable.COLUMN_CATEGORY,
                QuestionTable.COLUMN_LEVELS_ID
        };

        String selection = QuestionTable.COLUMN_LEVELS_ID + " = ? "
                + " AND " + QuestionTable.COLUMN_CATEGORY + " = ? ";

        String selectionArgs[] = new String[] {String.valueOf(LevelsID),Category};


        Cursor c = db.query(QuestionTable.TABLE_NAME,
                Projection,
                selection,
                selectionArgs,
                null,
                null,
                null);


        if (c.moveToFirst()) {
            do {

                TriviaQuestion question = new TriviaQuestion();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getString(c.getColumnIndex(QuestionTable.COLUMN_ANSWER_NR)));
                question.setCategory(c.getString(c.getColumnIndex(QuestionTable.COLUMN_CATEGORY)));
                question.setLevels(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_LEVELS_ID)));
                questionList.add(question);

            } while (c.moveToNext());

        }
        c.close();
        return questionList;
    }

}


