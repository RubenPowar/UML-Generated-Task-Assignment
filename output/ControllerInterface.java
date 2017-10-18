import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;

public interface ControllerInterface
{
  public void addSchedule(Schedule oo);
    public Schedule createSchedule();
  public void killSchedule(Schedule schedulexx);
 public void setconsistsOf(Schedule schedulex,List consistsOfxx);
   public void addconsistsOf(Schedule schedulex,Assignment consistsOfxx);
   public void removeconsistsOf(Schedule schedulex,Assignment consistsOfxx);
    public void addStory(Story oo);
    public Story createStory(String storyIdx);
  public void killStory(Story storyxx);
 public void setcontains(Story storyx,List containsxx);
   public void addcontains(Story storyx,Task containsxx);
   public void removecontains(Story storyx,Task containsxx);
    public void addStaff(Staff oo);
    public Staff createStaff(String staffIdx);
  public void killStaff(Staff staffxx);
 public void sethas(Staff staffx,List hasxx);
   public void addhas(Staff staffx,Skill hasxx);
   public void removehas(Staff staffx,Skill hasxx);
    public void addTask(Task oo);
    public Task createTask(String taskIdx);
  public void killTask(Task taskxx);
 public void setrequires(Task taskx,List requiresxx);
   public void addrequires(Task taskx,Skill requiresxx);
   public void removerequires(Task taskx,Skill requiresxx);
   public void setdependsOn(Task taskx,List dependsOnxx);
   public void adddependsOn(Task taskx,Task dependsOnxx);
   public void removedependsOn(Task taskx,Task dependsOnxx);
    public void addAssignment(Assignment oo);
    public Assignment createAssignment(Staff assignedTox,Task assignedForx);
  public void killAssignment(Assignment assignmentxx);
 public void setassignedTo(Assignment assignmentx,Staff assignedToxx);
 public void setassignedFor(Assignment assignmentx,Task assignedForxx);
  public void addSkill(Skill oo);
    public Skill createSkill(String skillIdx);
  public void killSkill(Skill skillxx);
}

