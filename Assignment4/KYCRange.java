package Assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class KYCRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCases = scanner.nextInt();
        List<LocalDate> signupDatesList = new ArrayList<>();
        List<LocalDate> currentDatesList = new ArrayList<>();
        for (int i=0;i<noOfTestCases;i++)
        {
            signupDatesList.add(LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            currentDatesList.add(LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }
        List<String> RangeOfDates=getRangeOfDatesKYC(signupDatesList,currentDatesList,noOfTestCases);
        for(String string:RangeOfDates)
        {
            System.out.println(string);
        }
    }
    public static List<String> getRangeOfDatesKYC(List<LocalDate> signupDatesList,List<LocalDate> currentDatesList,int noOfTestCases)
    {
        List<String> listOfDates=new ArrayList<>();
        for(int i=0;i<noOfTestCases;i++){
            if(signupDatesList.get(i).isAfter(currentDatesList.get(i)))
            {
                listOfDates.add("No range");
            }
            else
            {
                LocalDate newSignUpDate = signupDatesList.get(i).withYear(currentDatesList.get(i).getYear());
                if(newSignUpDate.plusDays(30).isAfter(currentDatesList.get(i)))  // check whether the currentDate fall within +30 days
                {
                    listOfDates.add(newSignUpDate.minusDays(30).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+" "+currentDatesList.get(i).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                }else
                {
                   listOfDates.add(newSignUpDate.minusDays(30).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+" "+newSignUpDate.plusDays(30).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                }

            }

        }
    return listOfDates;
    }
}