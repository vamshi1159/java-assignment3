package Assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        String hostName,command;
        int noOfTimesToPing;  //no of times ping the host
        scanner=new Scanner(System.in);
        System.out.println("Enter the host Address to ping");
        hostName=scanner.next();
        System.out.println("Enter No of times to ping host");
        noOfTimesToPing=scanner.nextInt();
        command="ping -c "+noOfTimesToPing+" "+hostName;  //command to execute the process
        System.out.println("median time taken to ping the host "+medianTimeTakenToPing(hostName,noOfTimesToPing,command)+"ms");
    }
    public static double medianTimeTakenToPing(String hostName,int noOfTimesToPing,String command)
    {
        double median=0.0;
        List<Double> timeTakenList;
        try{
            Process process=Runtime.getRuntime().exec(command);
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(process.getInputStream()));
            timeTakenList=getTimeTakenList(bufferedReader); //get the list of time taken by each ping command
            median=CalculateMedian(timeTakenList);
        } catch (Exception e)
        {
            System.out.println("error "+e.getMessage());
        }
        return median;
    }
    public static List<Double> getTimeTakenList(BufferedReader bufferedReader)
    {
        List<Double> timeTakenList=new ArrayList<>();
        try{
            String string;
            while((string=bufferedReader.readLine())!=null)
            {
                int startIndex=string.indexOf("time=");
                if(startIndex!=-1)  //if it's a ping the time lapse for a particular ping
                {
                    String time=string.substring(startIndex+5,string.indexOf(" ms"));
                    timeTakenList.add(Double.parseDouble(time));
                }
            }

        }
        catch (Exception e)
        {
            System.out.println("error "+e.getMessage());
        }
        return timeTakenList;
    }
    public static double CalculateMedian(List<Double> timeList)
    {
        Collections.sort(timeList);
        int length=timeList.size();
        //calculating median of a sorted list
        if(length%2==0) {
            return (timeList.get(length/2)+timeList.get(length/2+1))/2.0; //average
        }
        else{
            return timeList.get(length/2);
        }
    }
}
