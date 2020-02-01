public class Deadline extends Task{

    // Stores information about deadline of task
    private String deadline;

    // Overloaded Constructor
    public Deadline(String descriptionWithDeadline){
        super(getDescription(descriptionWithDeadline));
        taskType = 'D';
        this.deadline = getDeadline(descriptionWithDeadline);
    }

    // Abstracts out the description from the user given input and returns it
    private static String getDescription(String descriptionWithDeadline) {
        String[] split = descriptionWithDeadline.split("/",2);
        return split[0];
    }

    // Abstracts out the deadline from the user given input and returns it
    private static String getDeadline(String descriptionWithDeadline) {
        String[] split = descriptionWithDeadline.split("/",2);
        return (split[1].split(" ",2))[1];
    }

    // Returns the deadline in required format
    public String getDeadline(){
        return "(by: " + deadline + ")";
    }

    // Returns the task's type and status along with it's description as a string
    @Override
    public String getStatusWithDescription(){
        return "[" + this.taskType + "]" + super.getStatusWithDescription() + getDeadline();
    }
}