import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
      
            
    }
    public ArrayList<String> exerciseList(){
        // extract all the name from exercise and return it as a string.
        ArrayList<String> list = new ArrayList<>();
        for(Exercise exercise: exercises){
            list.add(exercise.getName());
        }
        return list;
    }
    
    public void add(String exercise){
        this.exercises.add(new Exercise(exercise));
    }
    
    public void markAsCompleted(String exercise){
        for (Exercise eachExercise: this.exercises){
            if(eachExercise.getName().equals(exercise)){
                eachExercise.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercise){
        for (Exercise eachExercise: this.exercises){
            if(eachExercise.getName().equals(exercise)){
                return eachExercise.isCompleted();
            }
        }
        
        return false;
    }
}
