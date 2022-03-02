
    import java.util.Scanner;

/**
 * InnerAssignment18
 */
/**
 * Assignment18
 */
public class Assignment18 {

    


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter the marks scored by student");
		System.out.print("Written Test  :   ");
		float WrittenTestScore = scan.nextFloat();
		
		System.out.print("Lab Exam  :   ");
		float LabExamScore = scan.nextFloat();
		
		System.out.print("Assignments  :  ");
		float AssignmentsScore = scan.nextFloat();
		
		float WrittenTestWeighted = WeightedAverage(WrittenTestScore , 70);
		float LabExamWeighted = WeightedAverage(LabExamScore, 20);
		float AssignmentWeighted = WeightedAverage(AssignmentsScore, 10);
		
		float OverallGrade = WrittenTestWeighted + LabExamWeighted + AssignmentWeighted;

        		
		System.out.print("\nGrade of the student is : " + OverallGrade);
		
		
	}
	
	public static float WeightedAverage(float score, float percentage) {
		float WeightedAverage;
		WeightedAverage = (score * percentage)/100;
		return WeightedAverage;
	}

}
    

