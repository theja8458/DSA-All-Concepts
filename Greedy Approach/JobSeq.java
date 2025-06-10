import java.util.*;
public class JobSeq {
    static class Job {
    int deadline;
    int profit;
    int id;
        public Job(int i,int d,int p){
            id=i;
          deadline=d;
          profit=p;
        }
    }

    public static void main(String args[]){
        int jobsInf[][]={{4,20},{1,10},{1,40},{1,30}};

          ArrayList<Job> jobs=new ArrayList<>();
            for(int i=0 ; i<jobsInf.length ; i++){
                jobs.add(new Job(i, jobsInf[i][0], jobsInf[i][1]));
            }
         Collections.sort(jobs,(obj1, obj2) -> obj2.profit-obj1.profit);

         ArrayList<Integer> seq=new ArrayList<>();
             
         int time=0;
         for(int i=0 ; i<jobs.size(); i++){
            Job cur=jobs.get(i);
            if(cur.deadline>time){
                seq.add(cur.id);
                time++;
            }
         }

         System.out.println("Max jobs = "+seq.size());
         for(int i=0 ; i<seq.size() ; i++){
            System.out.print(seq.get(i)+" ");
         }
         System.out.println();
    }
    
}
