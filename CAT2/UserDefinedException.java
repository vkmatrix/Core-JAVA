import java.util.Scanner;

class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

class ZeroSubjectException extends Exception{
    public ZeroSubjectException(String message)
    {
        super(message);
    }
}

class QueerException extends Exception
{
    public QueerException(String message)
    {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) throws NegativeMarksException,ZeroSubjectException,QueerException {
        char name;
        System.out.println("enter secret namecode");
        Scanner scanner = new Scanner(System.in);
        name=scanner.next().charAt(0);
        
        

        try {

            if(name=='q')
            {
                throw new QueerException("you are identified as queer fuck off!!!!");
            }
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            int[] marks = new int[numSubjects];

            if(numSubjects==0)
            {
                throw new ZeroSubjectException("minimum is 1 subject");
            }

            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();

                if (marks[i] < 0) {
                    throw new NegativeMarksException("please enter positive value");
                }
            }

            double totalMarks = calculateTotalMarks(marks);
            double averageMarks = calculateAverageMarks(totalMarks, marks.length);

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + averageMarks);
        }
        catch(ZeroSubjectException ze)
        {
            System.err.println("ZeroSubjectException:"+ze.getMessage());
        } 
        catch (NegativeMarksException e) {
            System.err.println("NegativeMarksException:  " + e.getMessage());
        }
        catch(QueerException qe)
        {
            System.err.println("QueerException: "+ qe.getMessage());
        }
        finally
        {
            System.out.println("exceptions are handled!!!!!");
        }
        
    }

    public static double calculateTotalMarks(int[] marks) {
        double total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static double calculateAverageMarks(double total, int count) {
        return total / count;
    }
}
