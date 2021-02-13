package calendaryear;

/*
NOTE: This program implements the proleptic Gregorian calendar.
Sunday = 0
Monday = 1
Tuesday = 2
Wednesday = 3
Thursday = 4
Friday = 5
Saturday = 6
*/

import java.util.Scanner;

public class CalendarYear {

public static void main(String[] args) {
	
//input block
Scanner scan = new Scanner(System.in);
System.out.print("Please enter a month (such as March 1900): ");
String input = scan.nextLine();

//separating month and year
int length = input.length();
int yearinput = Integer.parseInt(input.substring(length-4, length));
String monthinput = input.substring(0, length-5);

//error handling
if (!monthinput.equals("January") && !monthinput.equals("February") && !monthinput.equals("March") && !monthinput.equals("April") && !monthinput.equals("May") && !monthinput.equals("June") && !monthinput.equals("July") && !monthinput.equals("August") && !monthinput.equals("September") && !monthinput.equals("October") && !monthinput.equals("November") && !monthinput.equals("December")) {
	System.out.println("\nError. Please enter a month.");
	System.exit(0);
}
if (yearinput < 0) {
	System.out.println("\nError. Please enter a year.");
	System.exit(0);
}

//year after leap year identification (maybe unnecessary)
boolean leapyear;
if (yearinput % 400 == 0) {leapyear = true;}
else if (yearinput % 100 == 0) {leapyear = false;}
else if (yearinput % 4 == 0) {leapyear = true;}
else {leapyear = false;}

//printing top row of calendar
System.out.println("\n"+monthinput + " " + yearinput + ":\n" + "Sun Mon Tue Wed Thu Fri Sat");

//identifying Jan 1st of the year
int firstofjan = 1;
int yeardiff = yearinput - 1;
int daystoadd = yeardiff + yeardiff/4 - yeardiff/100 + yeardiff/400;
firstofjan = (firstofjan+daystoadd)%7;

//defining the first of the current month
int firstofmonth = 0;
int firstofmar;
if (leapyear == true) {
	firstofmar = firstofjan+31+29;
}
else {
	firstofmar = firstofjan+31+28;
}
	
if (monthinput.equals("January")) {firstofmonth = firstofjan;}
if (monthinput.equals("February")) {firstofmonth = firstofjan+31;}
if (monthinput.equals("March")) {firstofmonth = firstofmar;}
if (monthinput.equals("April")) {firstofmonth = firstofmar+31;}
if (monthinput.equals("May")) {firstofmonth = firstofmar+31+30;}
if (monthinput.equals("June")) {firstofmonth = firstofmar+31+30+31;}
if (monthinput.equals("July")) {firstofmonth = firstofmar+31+30+31+30;}
if (monthinput.equals("August")) {firstofmonth = firstofmar+31+30+31+30+31;}
if (monthinput.equals("September")) {firstofmonth = firstofmar+31+30+31+30+31+31;}
if (monthinput.equals("October")) {firstofmonth = firstofmar+31+30+31+30+31+31+30;}
if (monthinput.equals("November")) {firstofmonth = firstofmar+31+30+31+30+31+31+30+31;}
if (monthinput.equals("December")) {firstofmonth = firstofmar+31+30+31+30+31+31+30+31+30;}
firstofmonth = firstofmonth % 7;


//printing Jan 1st of a year (to test; using an array here)
/*String[] sevendays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
System.out.print(sevendays[firstofjan]);*/

//assign day of the month
int daysinthemonth;
if (monthinput.equals("February") && leapyear==true) {
	daysinthemonth = 29;
}
else if (monthinput.equals("February")) {
	daysinthemonth = 28;
}
else if (monthinput.equals("September") || monthinput.equals("November") || monthinput.equals("April") || monthinput.equals("June")) {
	daysinthemonth = 30;
}
else {
	daysinthemonth = 31;
}

//printing Sunday months
if (firstofmonth == 0) {
	if (daysinthemonth == 31) {
		System.out.println(" 01  02  03  04  05  06  07");
		System.out.println(" 08  09  10  11  12  13  14");
		System.out.println(" 15  16  17  18  19  20  21");
		System.out.println(" 22  23  24  25  26  27  28");
		System.out.println(" 29  30  31");
	}
	else if (daysinthemonth == 30) {
		System.out.println(" 01  02  03  04  05  06  07");
		System.out.println(" 08  09  10  11  12  13  14");
		System.out.println(" 15  16  17  18  19  20  21");
		System.out.println(" 22  23  24  25  26  27  28");
		System.out.println(" 29  30");
	}
	else if (daysinthemonth == 29) {
		System.out.println(" 01  02  03  04  05  06  07");
		System.out.println(" 08  09  10  11  12  13  14");
		System.out.println(" 15  16  17  18  19  20  21");
		System.out.println(" 22  23  24  25  26  27  28");
		System.out.println(" 29");
	}
	else {
		System.out.println(" 01  02  03  04  05  06  07");
		System.out.println(" 08  09  10  11  12  13  14");
		System.out.println(" 15  16  17  18  19  20  21");
		System.out.println(" 22  23  24  25  26  27  28");
	}
}

//printing Monday months
else if (firstofmonth == 1) {
	if (daysinthemonth == 31) {
		System.out.println("     01  02  03  04  05  06");
		System.out.println(" 07  08  09  10  11  12  13");
		System.out.println(" 14  15  16  17  18  19  20");
		System.out.println(" 21  22  23  24  25  26  27");
		System.out.println(" 28  29  30  31");
	}
	else if (daysinthemonth == 30) {
		System.out.println("     01  02  03  04  05  06");
		System.out.println(" 07  08  09  10  11  12  13");
		System.out.println(" 14  15  16  17  18  19  20");
		System.out.println(" 21  22  23  24  25  26  27");
		System.out.println(" 28  29  30");
	}
	else if (daysinthemonth == 29) {
		System.out.println("     01  02  03  04  05  06");
		System.out.println(" 07  08  09  10  11  12  13");
		System.out.println(" 14  15  16  17  18  19  20");
		System.out.println(" 21  22  23  24  25  26  27");
		System.out.println(" 28  29");
	}
	else {
		System.out.println("     01  02  03  04  05  06");
		System.out.println(" 07  08  09  10  11  12  13");
		System.out.println(" 14  15  16  17  18  19  20");
		System.out.println(" 21  22  23  24  25  26  27");
		System.out.println(" 28");
	}
}
//printing Tuesday months
else if (firstofmonth == 2) {
	if (daysinthemonth == 31) {
		System.out.println("         01  02  03  04  05");
		System.out.println(" 06  07  08  09  10  11  12");
		System.out.println(" 13  14  15  16  17  18  19");
		System.out.println(" 20  21  22  23  24  25  26");
		System.out.println(" 27  28  29  30  31");
	}
	else if (daysinthemonth == 30) {
		System.out.println("         01  02  03  04  05");
		System.out.println(" 06  07  08  09  10  11  12");
		System.out.println(" 13  14  15  16  17  18  19");
		System.out.println(" 20  21  22  23  24  25  26");
		System.out.println(" 27  28  29  30");
	}
	else if (daysinthemonth == 29) {
		System.out.println("         01  02  03  04  05");
		System.out.println(" 06  07  08  09  10  11  12");
		System.out.println(" 13  14  15  16  17  18  19");
		System.out.println(" 20  21  22  23  24  25  26");
		System.out.println(" 27  28  29");
	}
	else {
		System.out.println("         01  02  03  04  05");
		System.out.println(" 06  07  08  09  10  11  12");
		System.out.println(" 13  14  15  16  17  18  19");
		System.out.println(" 20  21  22  23  24  25  26");
		System.out.println(" 27  28");
	}
}

//printing Wednesday months
else if (firstofmonth == 3) {
	if (daysinthemonth == 31) {
		System.out.println("             01  02  03  04");
		System.out.println(" 05  06  07  08  09  10  11");
		System.out.println(" 12  13  14  15  16  17  18");
		System.out.println(" 19  20  21  22  23  24  25");
		System.out.println(" 26  27  28  29  30  31");
	}
	else if (daysinthemonth == 30) {
		System.out.println("             01  02  03  04");
		System.out.println(" 05  06  07  08  09  10  11");
		System.out.println(" 12  13  14  15  16  17  18");
		System.out.println(" 19  20  21  22  23  24  25");
		System.out.println(" 26  27  28  29  30");
	}
	else if (daysinthemonth == 29) {
		System.out.println("             01  02  03  04");
		System.out.println(" 05  06  07  08  09  10  11");
		System.out.println(" 12  13  14  15  16  17  18");
		System.out.println(" 19  20  21  22  23  24  25");
		System.out.println(" 26  27  28  29");
	}
	else {
		System.out.println("             01  02  03  04");
		System.out.println(" 05  06  07  08  09  10  11");
		System.out.println(" 12  13  14  15  16  17  18");
		System.out.println(" 19  20  21  22  23  24  25");
		System.out.println(" 26  27  28");
	}
}

//printing Thursday months
else if (firstofmonth == 4) {
	if (daysinthemonth == 31) {
		System.out.println("                 01  02  03");
		System.out.println(" 04  05  06  07  08  09  10");
		System.out.println(" 11  12  13  14  15  16  17");
		System.out.println(" 18  19  20  21  22  23  24");
		System.out.println(" 25  26  27  28  29  30  31");
	}
	else if (daysinthemonth == 30) {
		System.out.println("                 01  02  03");
		System.out.println(" 04  05  06  07  08  09  10");
		System.out.println(" 11  12  13  14  15  16  17");
		System.out.println(" 18  19  20  21  22  23  24");
		System.out.println(" 25  26  27  28  29  30");
	}
	else if (daysinthemonth == 29) {
		System.out.println("                 01  02  03");
		System.out.println(" 04  05  06  07  08  09  10");
		System.out.println(" 11  12  13  14  15  16  17");
		System.out.println(" 18  19  20  21  22  23  24");
		System.out.println(" 25  26  27  28  29");
	}
	else {
		System.out.println("                 01  02  03");
		System.out.println(" 04  05  06  07  08  09  10");
		System.out.println(" 11  12  13  14  15  16  17");
		System.out.println(" 18  19  20  21  22  23  24");
		System.out.println(" 25  26  27  28");
	}
}

//printing Friday months
else if (firstofmonth == 5) {
	if (daysinthemonth == 31) {
		System.out.println("                     01  02");
		System.out.println(" 03  04  05  06  07  08  09");
		System.out.println(" 10  11  12  13  14  15  16");
		System.out.println(" 17  18  19  20  21  22  23");
		System.out.println(" 24  25  26  27  28  29  30");
		System.out.println(" 31");
	}
	else if (daysinthemonth == 30) {
		System.out.println("                     01  02");
		System.out.println(" 03  04  05  06  07  08  09");
		System.out.println(" 10  11  12  13  14  15  16");
		System.out.println(" 17  18  19  20  21  22  23");
		System.out.println(" 24  25  26  27  28  29  30");
	}
	else if (daysinthemonth == 29) {
		System.out.println("                     01  02");
		System.out.println(" 03  04  05  06  07  08  09");
		System.out.println(" 10  11  12  13  14  15  16");
		System.out.println(" 17  18  19  20  21  22  23");
		System.out.println(" 24  25  26  27  28  29");
	}
	else {
		System.out.println("                     01  02");
		System.out.println(" 03  04  05  06  07  08  09");
		System.out.println(" 10  11  12  13  14  15  16");
		System.out.println(" 17  18  19  20  21  22  23");
		System.out.println(" 24  25  26  27  28");
	}
}
//printing Saturday months
else {
	if (daysinthemonth == 31) {
		System.out.println("                         01");
		System.out.println(" 02  03  04  05  06  07  08");
		System.out.println(" 09  10  11  12  13  14  15");
		System.out.println(" 16  17  18  19  20  21  22");
		System.out.println(" 23  24  25  26  27  28  29");
		System.out.println(" 30  31");
	}
	else if (daysinthemonth == 30) {
		System.out.println("                         01");
		System.out.println(" 02  03  04  05  06  07  08");
		System.out.println(" 09  10  11  12  13  14  15");
		System.out.println(" 16  17  18  19  20  21  22");
		System.out.println(" 23  24  25  26  27  28  29");
		System.out.println(" 30");
	}
	else if (daysinthemonth == 29) {
		System.out.println("                         01");
		System.out.println(" 02  03  04  05  06  07  08");
		System.out.println(" 09  10  11  12  13  14  15");
		System.out.println(" 16  17  18  19  20  21  22");
		System.out.println(" 23  24  25  26  27  28  29");
	}
	else {
		System.out.println("                         01");
		System.out.println(" 02  03  04  05  06  07  08");
		System.out.println(" 09  10  11  12  13  14  15");
		System.out.println(" 16  17  18  19  20  21  22");
		System.out.println(" 23  24  25  26  27  28");
	}
}
	
}
}