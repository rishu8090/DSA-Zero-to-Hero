import java.util.*;
public class App {

    static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int i , int d, int p){
             id = i;
             deadline = d;
             profit = p;
        }   
     }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList <Job> jobs = new ArrayList<>();
        for(int i = 0 ; i < jobInfo.length; i++ ){
            jobs.add(new Job(i , jobInfo[i][0], jobInfo[i][1]));
        }
        Collections.sort(jobs, (obj1 , obj2) -> obj2.profit - obj1.profit); // gives desending order of profit.

         // for assending -> obj1 - obj2;
        
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size() ; i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        // print seq.
        System.out.println("Max jobs :" + seq.size());
        for(int i = 0 ; i < seq.size(); i++){
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();
    }
}
