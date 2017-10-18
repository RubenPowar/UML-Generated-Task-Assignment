import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;

import java.lang.*;
import java.lang.reflect.*;
import java.util.StringTokenizer;
import java.io.*;



class Schedule
  implements SystemTypes
{
  private int totalCost = 0; // internal
  private int duration = 0; // internal
  private List consistsOf = new Vector(); // of Assignment

  public Schedule()
  {
    this.totalCost = 0;
    this.duration = 0;

  }



  public String toString()
  { String _res_ = "(Schedule) ";
    _res_ = _res_ + totalCost + ",";
    _res_ = _res_ + duration;
    return _res_;
  }

  public void settotalCost(int totalCost_x) { totalCost = totalCost_x;  }


    public static void setAlltotalCost(List schedules,int val)
  { for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      Controller.inst().settotalCost(schedulex,val); } }


  public void setduration(int duration_x) { duration = duration_x;  }


    public static void setAllduration(List schedules,int val)
  { for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      Controller.inst().setduration(schedulex,val); } }


  public void setconsistsOf(List consistsOfxx) { consistsOf = consistsOfxx;
    }
 
  public void addconsistsOf(Assignment consistsOfxx) { consistsOf.add(consistsOfxx);
    }
 
  public void removeconsistsOf(Assignment consistsOfxx) { Vector _removedconsistsOfconsistsOfxx = new Vector();
  _removedconsistsOfconsistsOfxx.add(consistsOfxx);
  consistsOf.removeAll(_removedconsistsOfconsistsOfxx);
    }

  public static void setAllconsistsOf(List schedules,List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().setconsistsOf(schedulex, _val); } }

  public static void addAllconsistsOf(List schedules,Assignment _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().addconsistsOf(schedulex, _val); } }


  public static void removeAllconsistsOf(List schedules,Assignment _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().removeconsistsOf(schedulex, _val); } }


  public static void unionAllconsistsOf(List schedules, List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().unionconsistsOf(schedulex, _val); } }


  public static void subtractAllconsistsOf(List schedules, List _val)
  { for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      Controller.inst().subtractconsistsOf(schedulex, _val); } }


    public int gettotalCost() { return totalCost; }

    public static List getAlltotalCost(List schedules)
  { List result = new Vector();
    for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      if (result.contains(new Integer(schedulex.gettotalCost()))) { }
      else { result.add(new Integer(schedulex.gettotalCost())); } }
    return result; }

    public static List getAllOrderedtotalCost(List schedules)
  { List result = new Vector();
    for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      result.add(new Integer(schedulex.gettotalCost())); } 
    return result; }

    public int getduration() { return duration; }

    public static List getAllduration(List schedules)
  { List result = new Vector();
    for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      if (result.contains(new Integer(schedulex.getduration()))) { }
      else { result.add(new Integer(schedulex.getduration())); } }
    return result; }

    public static List getAllOrderedduration(List schedules)
  { List result = new Vector();
    for (int i = 0; i < schedules.size(); i++)
    { Schedule schedulex = (Schedule) schedules.get(i);
      result.add(new Integer(schedulex.getduration())); } 
    return result; }

  public List getconsistsOf() { return (Vector) ((Vector) consistsOf).clone(); }

  public static List getAllconsistsOf(List schedules)
  { List result = new Vector();
    for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      result = Set.union(result,schedulex.getconsistsOf()); }
    return result; }

  public static List getAllOrderedconsistsOf(List schedules)
  { List result = new Vector();
    for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex = (Schedule) schedules.get(_i);
      result = Set.union(result,schedulex.getconsistsOf()); }
    return result; }


}


class Story
  implements SystemTypes
{
  private String storyId = ""; // internal
  private List contains = new Vector(); // of Task

  public Story()
  {
    this.storyId = "";

  }



  public String toString()
  { String _res_ = "(Story) ";
    _res_ = _res_ + storyId;
    return _res_;
  }

  public void setstoryId(String storyId_x) { storyId = storyId_x;  }


    public static void setAllstoryId(List storys,String val)
  { for (int i = 0; i < storys.size(); i++)
    { Story storyx = (Story) storys.get(i);
      Controller.inst().setstoryId(storyx,val); } }


  public void setcontains(List containsxx) { contains = containsxx;
    }
 
  public void setcontains(int ind_x,Task containsxx) { contains.set(ind_x,containsxx); }

 public void addcontains(Task containsxx) { contains.add(containsxx);
    }
 
  public void removecontains(Task containsxx) { Vector _removedcontainscontainsxx = new Vector();
  _removedcontainscontainsxx.add(containsxx);
  contains.removeAll(_removedcontainscontainsxx);
    }

  public static void setAllcontains(List storys,List _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().setcontains(storyx, _val); } }

  public static void setAllcontains(List storys,int _ind,Task _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().setcontains(storyx,_ind,_val); } }

  public static void addAllcontains(List storys,Task _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().addcontains(storyx, _val); } }


  public static void removeAllcontains(List storys,Task _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().removecontains(storyx, _val); } }


  public static void unionAllcontains(List storys, List _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().unioncontains(storyx, _val); } }


  public static void subtractAllcontains(List storys, List _val)
  { for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      Controller.inst().subtractcontains(storyx, _val); } }


    public String getstoryId() { return storyId; }

    public static List getAllstoryId(List storys)
  { List result = new Vector();
    for (int i = 0; i < storys.size(); i++)
    { Story storyx = (Story) storys.get(i);
      if (result.contains(storyx.getstoryId())) { }
      else { result.add(storyx.getstoryId()); } }
    return result; }

    public static List getAllOrderedstoryId(List storys)
  { List result = new Vector();
    for (int i = 0; i < storys.size(); i++)
    { Story storyx = (Story) storys.get(i);
      result.add(storyx.getstoryId()); } 
    return result; }

  public List getcontains() { return (Vector) ((Vector) contains).clone(); }

  public static List getAllcontains(List storys)
  { List result = new Vector();
    for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      result = Set.union(result,storyx.getcontains()); }
    return result; }

  public static List getAllOrderedcontains(List storys)
  { List result = new Vector();
    for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx = (Story) storys.get(_i);
      result.addAll(storyx.getcontains()); }
    return result; }


}


class Staff
  implements SystemTypes
{
  private String staffId = ""; // internal
  private int costDay = 0; // internal
  private List has = new Vector(); // of Skill

  public Staff()
  {
    this.staffId = "";
    this.costDay = 0;

  }



  public String toString()
  { String _res_ = "(Staff) ";
    _res_ = _res_ + staffId + ",";
    _res_ = _res_ + costDay;
    return _res_;
  }

  public void setstaffId(String staffId_x) { staffId = staffId_x;  }


    public static void setAllstaffId(List staffs,String val)
  { for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      Controller.inst().setstaffId(staffx,val); } }


  public void setcostDay(int costDay_x) { costDay = costDay_x;  }


    public static void setAllcostDay(List staffs,int val)
  { for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      Controller.inst().setcostDay(staffx,val); } }


  public void sethas(List hasxx) { has = hasxx;
    }
 
  public void addhas(Skill hasxx) { has.add(hasxx);
    }
 
  public void removehas(Skill hasxx) { Vector _removedhashasxx = new Vector();
  _removedhashasxx.add(hasxx);
  has.removeAll(_removedhashasxx);
    }

  public static void setAllhas(List staffs,List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().sethas(staffx, _val); } }

  public static void addAllhas(List staffs,Skill _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().addhas(staffx, _val); } }


  public static void removeAllhas(List staffs,Skill _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().removehas(staffx, _val); } }


  public static void unionAllhas(List staffs, List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().unionhas(staffx, _val); } }


  public static void subtractAllhas(List staffs, List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().subtracthas(staffx, _val); } }


    public String getstaffId() { return staffId; }

    public static List getAllstaffId(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      if (result.contains(staffx.getstaffId())) { }
      else { result.add(staffx.getstaffId()); } }
    return result; }

    public static List getAllOrderedstaffId(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      result.add(staffx.getstaffId()); } 
    return result; }

    public int getcostDay() { return costDay; }

    public static List getAllcostDay(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      if (result.contains(new Integer(staffx.getcostDay()))) { }
      else { result.add(new Integer(staffx.getcostDay())); } }
    return result; }

    public static List getAllOrderedcostDay(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      result.add(new Integer(staffx.getcostDay())); } 
    return result; }

  public List gethas() { return (Vector) ((Vector) has).clone(); }

  public static List getAllhas(List staffs)
  { List result = new Vector();
    for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      result = Set.union(result,staffx.gethas()); }
    return result; }

  public static List getAllOrderedhas(List staffs)
  { List result = new Vector();
    for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      result = Set.union(result,staffx.gethas()); }
    return result; }


}


class Task
  implements SystemTypes
{
  private String taskId = ""; // internal
  private int duration = 0; // internal
  private List requires = new Vector(); // of Skill
  private List dependsOn = new Vector(); // of Task

  public Task()
  {
    this.taskId = "";
    this.duration = 0;

  }



  public String toString()
  { String _res_ = "(Task) ";
    _res_ = _res_ + taskId + ",";
    _res_ = _res_ + duration;
    return _res_;
  }

  public void settaskId(String taskId_x) { taskId = taskId_x;  }


    public static void setAlltaskId(List tasks,String val)
  { for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      Controller.inst().settaskId(taskx,val); } }


  public void setduration(int duration_x) { duration = duration_x;  }


    public static void setAllduration(List tasks,int val)
  { for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      Controller.inst().setduration(taskx,val); } }


  public void setrequires(List requiresxx) { requires = requiresxx;
    }
 
  public void addrequires(Skill requiresxx) { requires.add(requiresxx);
    }
 
  public void removerequires(Skill requiresxx) { Vector _removedrequiresrequiresxx = new Vector();
  _removedrequiresrequiresxx.add(requiresxx);
  requires.removeAll(_removedrequiresrequiresxx);
    }

  public static void setAllrequires(List tasks,List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().setrequires(taskx, _val); } }

  public static void addAllrequires(List tasks,Skill _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().addrequires(taskx, _val); } }


  public static void removeAllrequires(List tasks,Skill _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().removerequires(taskx, _val); } }


  public static void unionAllrequires(List tasks, List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().unionrequires(taskx, _val); } }


  public static void subtractAllrequires(List tasks, List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().subtractrequires(taskx, _val); } }


  public void setdependsOn(List dependsOnxx) { dependsOn = dependsOnxx;
    }
 
  public void adddependsOn(Task dependsOnxx) { dependsOn.add(dependsOnxx);
    }
 
  public void removedependsOn(Task dependsOnxx) { Vector _removeddependsOndependsOnxx = new Vector();
  _removeddependsOndependsOnxx.add(dependsOnxx);
  dependsOn.removeAll(_removeddependsOndependsOnxx);
    }

  public static void setAlldependsOn(List tasks,List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().setdependsOn(taskx, _val); } }

  public static void addAlldependsOn(List tasks,Task _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().adddependsOn(taskx, _val); } }


  public static void removeAlldependsOn(List tasks,Task _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().removedependsOn(taskx, _val); } }


  public static void unionAlldependsOn(List tasks, List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().uniondependsOn(taskx, _val); } }


  public static void subtractAlldependsOn(List tasks, List _val)
  { for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      Controller.inst().subtractdependsOn(taskx, _val); } }


    public String gettaskId() { return taskId; }

    public static List getAlltaskId(List tasks)
  { List result = new Vector();
    for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      if (result.contains(taskx.gettaskId())) { }
      else { result.add(taskx.gettaskId()); } }
    return result; }

    public static List getAllOrderedtaskId(List tasks)
  { List result = new Vector();
    for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      result.add(taskx.gettaskId()); } 
    return result; }

    public int getduration() { return duration; }

    public static List getAllduration(List tasks)
  { List result = new Vector();
    for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      if (result.contains(new Integer(taskx.getduration()))) { }
      else { result.add(new Integer(taskx.getduration())); } }
    return result; }

    public static List getAllOrderedduration(List tasks)
  { List result = new Vector();
    for (int i = 0; i < tasks.size(); i++)
    { Task taskx = (Task) tasks.get(i);
      result.add(new Integer(taskx.getduration())); } 
    return result; }

  public List getrequires() { return (Vector) ((Vector) requires).clone(); }

  public static List getAllrequires(List tasks)
  { List result = new Vector();
    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      result = Set.union(result,taskx.getrequires()); }
    return result; }

  public static List getAllOrderedrequires(List tasks)
  { List result = new Vector();
    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      result = Set.union(result,taskx.getrequires()); }
    return result; }

  public List getdependsOn() { return (Vector) ((Vector) dependsOn).clone(); }

  public static List getAlldependsOn(List tasks)
  { List result = new Vector();
    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      result = Set.union(result,taskx.getdependsOn()); }
    return result; }

  public static List getAllOrdereddependsOn(List tasks)
  { List result = new Vector();
    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx = (Task) tasks.get(_i);
      result = Set.union(result,taskx.getdependsOn()); }
    return result; }


}


class Assignment
  implements SystemTypes
{
  private Staff assignedTo;
  private Task assignedFor;

  public Assignment(Staff assignedTo,Task assignedFor)
  {
    this.assignedTo = assignedTo;
    this.assignedFor = assignedFor;

  }

  public Assignment() { }



  public String toString()
  { String _res_ = "(Assignment) ";
    return _res_;
  }

  public void setassignedTo(Staff assignedToxx) { assignedTo = assignedToxx;
  }

  public static void setAllassignedTo(List assignments,Staff _val)
  { for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      Controller.inst().setassignedTo(assignmentx, _val); } }

  public void setassignedFor(Task assignedForxx) { assignedFor = assignedForxx;
  }

  public static void setAllassignedFor(List assignments,Task _val)
  { for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      Controller.inst().setassignedFor(assignmentx, _val); } }

  public Staff getassignedTo() { return assignedTo; }

  public static List getAllassignedTo(List assignments)
  { List result = new Vector();
    for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      if (result.contains(assignmentx.getassignedTo())) {}
      else { result.add(assignmentx.getassignedTo()); }
 }
    return result; }

  public static List getAllOrderedassignedTo(List assignments)
  { List result = new Vector();
    for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      if (result.contains(assignmentx.getassignedTo())) {}
      else { result.add(assignmentx.getassignedTo()); }
 }
    return result; }

  public Task getassignedFor() { return assignedFor; }

  public static List getAllassignedFor(List assignments)
  { List result = new Vector();
    for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      if (result.contains(assignmentx.getassignedFor())) {}
      else { result.add(assignmentx.getassignedFor()); }
 }
    return result; }

  public static List getAllOrderedassignedFor(List assignments)
  { List result = new Vector();
    for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx = (Assignment) assignments.get(_i);
      if (result.contains(assignmentx.getassignedFor())) {}
      else { result.add(assignmentx.getassignedFor()); }
 }
    return result; }


}


class Skill
  implements SystemTypes
{
  private String skillId = ""; // internal

  public Skill()
  {
    this.skillId = "";

  }



  public String toString()
  { String _res_ = "(Skill) ";
    _res_ = _res_ + skillId;
    return _res_;
  }

  public void setskillId(String skillId_x) { skillId = skillId_x;  }


    public static void setAllskillId(List skills,String val)
  { for (int i = 0; i < skills.size(); i++)
    { Skill skillx = (Skill) skills.get(i);
      Controller.inst().setskillId(skillx,val); } }


    public String getskillId() { return skillId; }

    public static List getAllskillId(List skills)
  { List result = new Vector();
    for (int i = 0; i < skills.size(); i++)
    { Skill skillx = (Skill) skills.get(i);
      if (result.contains(skillx.getskillId())) { }
      else { result.add(skillx.getskillId()); } }
    return result; }

    public static List getAllOrderedskillId(List skills)
  { List result = new Vector();
    for (int i = 0; i < skills.size(); i++)
    { Skill skillx = (Skill) skills.get(i);
      result.add(skillx.getskillId()); } 
    return result; }


}



public class Controller implements SystemTypes, ControllerInterface
{
  Vector schedules = new Vector();
  Vector storys = new Vector();
  Map storystoryIdindex = new HashMap(); // String --> Story

  Vector staffs = new Vector();
  Map staffstaffIdindex = new HashMap(); // String --> Staff

  Vector tasks = new Vector();
  Map tasktaskIdindex = new HashMap(); // String --> Task

  Vector assignments = new Vector();
  Vector skills = new Vector();
  Map skillskillIdindex = new HashMap(); // String --> Skill

  private static Controller uniqueInstance; 


  private Controller() { } 


  public static Controller inst() 
    { if (uniqueInstance == null) 
    { uniqueInstance = new Controller(); }
    return uniqueInstance; } 


  public static void loadModel(String file)
  {
    try
    { BufferedReader br = null;
      File f = new File(file);
      try 
      { br = new BufferedReader(new FileReader(f)); }
      catch (Exception ex) 
      { System.err.println("No file: " + file); return; }
      Class cont = Class.forName("Controller");
      java.util.Map objectmap = new java.util.HashMap();
      while (true)
      { String line1;
        try { line1 = br.readLine(); }
        catch (Exception e)
        { return; }
        if (line1 == null)
        { return; }
        line1 = line1.trim();

        if (line1.length() == 0) { continue; }
        String left;
        String op;
        String right;
        if (line1.charAt(line1.length() - 1) == '"')
        { int eqind = line1.indexOf("="); 
          if (eqind == -1) { continue; }
          else 
          { left = line1.substring(0,eqind-1).trim();
            op = "="; 
            right = line1.substring(eqind+1,line1.length()).trim();
          }
        }
        else
        { StringTokenizer st1 = new StringTokenizer(line1);
          Vector vals1 = new Vector();
          while (st1.hasMoreTokens())
          { String val1 = st1.nextToken();
            vals1.add(val1);
          }
          if (vals1.size() < 3)
          { continue; }
          left = (String) vals1.get(0);
          op = (String) vals1.get(1);
          right = (String) vals1.get(2);
        }
        if (":".equals(op))
        { int i2 = right.indexOf(".");
          if (i2 == -1)
          { Class cl;
            try { cl = Class.forName("" + right); }
            catch (Exception _x) { System.err.println("No entity: " + right); continue; }
            Object xinst = cl.newInstance();
            objectmap.put(left,xinst);
            Class[] cargs = new Class[] { cl };
            Method addC = cont.getMethod("add" + right,cargs);
            if (addC == null) { continue; }
            Object[] args = new Object[] { xinst };
            addC.invoke(Controller.inst(),args);
          }
          else
          { String obj = right.substring(0,i2);
            String role = right.substring(i2+1,right.length());
            Object objinst = objectmap.get(obj); 
            if (objinst == null) 
            { continue; }
            Object val = objectmap.get(left);
            if (val == null) 
            { continue; }
            Class objC = objinst.getClass();
            Class typeclass = val.getClass(); 
            Object[] args = new Object[] { val }; 
            Class[] settypes = new Class[] { typeclass };
            Method addrole = Controller.findMethod(objC,"add" + role);
            if (addrole != null) 
            { addrole.invoke(objinst, args); }
            else { System.err.println("Error: cannot add to " + role); }
          }
        }
        else if ("=".equals(op))
        { int i1 = left.indexOf(".");
          if (i1 == -1) 
          { continue; }
          String obj = left.substring(0,i1);
          String att = left.substring(i1+1,left.length());
          Object objinst = objectmap.get(obj); 
          if (objinst == null) 
          { continue; }
          Class objC = objinst.getClass();
          Class typeclass; 
          Object val; 
          if (right.charAt(0) == '"' &&
              right.charAt(right.length() - 1) == '"')
          { typeclass = String.class;
            val = right.substring(1,right.length() - 1);
          } 
          else if ("true".equals(right) || "false".equals(right))
          { typeclass = boolean.class;
            if ("true".equals(right))
            { val = new Boolean(true); }
            else
            { val = new Boolean(false); }
          }
          else 
          { val = objectmap.get(right);
            if (val != null)
            { typeclass = val.getClass(); }
            else 
            { int i;
              long l; 
              double d;
              try 
              { i = Integer.parseInt(right);
                typeclass = int.class;
                val = new Integer(i); 
              }
              catch (Exception ee)
              { try 
                { l = Long.parseLong(right);
                  typeclass = long.class;
                  val = new Long(l); 
                }
                catch (Exception eee)
                { try
                  { d = Double.parseDouble(right);
                    typeclass = double.class;
                    val = new Double(d);
                  }
                  catch (Exception ff)
                  { continue; }
                }
              }
            }
          }
          Object[] args = new Object[] { val }; 
          Class[] settypes = new Class[] { typeclass };
          Method setatt = Controller.findMethod(objC,"set" + att);
          if (setatt != null) 
          { setatt.invoke(objinst, args); }
          else { System.err.println("No attribute: " + att); }
        }
      }
    } catch (Exception e) { }
  }

  public static Method findMethod(Class c, String name)
  { Method[] mets = c.getMethods(); 
    for (int i = 0; i < mets.length; i++)
    { Method m = mets[i];
      if (m.getName().equals(name))
      { return m; }
    } 
    return null;
  }


  public void checkCompleteness()
  {   for (int _i = 0; _i < storys.size(); _i++)
  { Story story_x = (Story) storys.get(_i);
    Story story_obj = (Story) storystoryIdindex.get(story_x.getstoryId());
    if (story_obj == story_x) { }
    else if (story_obj == null)
    { storystoryIdindex.put(story_x.getstoryId(),story_x); }
    else
    { System.out.println("Error: multiple objects with storyId = " + story_x.getstoryId()); }
  }
  for (int _i = 0; _i < staffs.size(); _i++)
  { Staff staff_x = (Staff) staffs.get(_i);
    Staff staff_obj = (Staff) staffstaffIdindex.get(staff_x.getstaffId());
    if (staff_obj == staff_x) { }
    else if (staff_obj == null)
    { staffstaffIdindex.put(staff_x.getstaffId(),staff_x); }
    else
    { System.out.println("Error: multiple objects with staffId = " + staff_x.getstaffId()); }
  }
  for (int _i = 0; _i < tasks.size(); _i++)
  { Task task_x = (Task) tasks.get(_i);
    Task task_obj = (Task) tasktaskIdindex.get(task_x.gettaskId());
    if (task_obj == task_x) { }
    else if (task_obj == null)
    { tasktaskIdindex.put(task_x.gettaskId(),task_x); }
    else
    { System.out.println("Error: multiple objects with taskId = " + task_x.gettaskId()); }
  }
  for (int _i = 0; _i < skills.size(); _i++)
  { Skill skill_x = (Skill) skills.get(_i);
    Skill skill_obj = (Skill) skillskillIdindex.get(skill_x.getskillId());
    if (skill_obj == skill_x) { }
    else if (skill_obj == null)
    { skillskillIdindex.put(skill_x.getskillId(),skill_x); }
    else
    { System.out.println("Error: multiple objects with skillId = " + skill_x.getskillId()); }
  }
  }


  public void saveModel(String file)
  { File outfile = new File(file); 
    PrintWriter out; 
    try { out = new PrintWriter(new BufferedWriter(new FileWriter(outfile))); }
    catch (Exception e) { return; } 
  for (int _i = 0; _i < schedules.size(); _i++)
  { Schedule schedulex_ = (Schedule) schedules.get(_i);
    out.println("schedulex_" + _i + " : Schedule");
    out.println("schedulex_" + _i + ".totalCost = " + schedulex_.gettotalCost());
    out.println("schedulex_" + _i + ".duration = " + schedulex_.getduration());
  }

  for (int _i = 0; _i < storys.size(); _i++)
  { Story storyx_ = (Story) storys.get(_i);
    out.println("storyx_" + _i + " : Story");
    out.println("storyx_" + _i + ".storyId = \"" + storyx_.getstoryId() + "\"");
  }

  for (int _i = 0; _i < staffs.size(); _i++)
  { Staff staffx_ = (Staff) staffs.get(_i);
    out.println("staffx_" + _i + " : Staff");
    out.println("staffx_" + _i + ".staffId = \"" + staffx_.getstaffId() + "\"");
    out.println("staffx_" + _i + ".costDay = " + staffx_.getcostDay());
  }

  for (int _i = 0; _i < tasks.size(); _i++)
  { Task taskx_ = (Task) tasks.get(_i);
    out.println("taskx_" + _i + " : Task");
    out.println("taskx_" + _i + ".taskId = \"" + taskx_.gettaskId() + "\"");
    out.println("taskx_" + _i + ".duration = " + taskx_.getduration());
  }

  for (int _i = 0; _i < assignments.size(); _i++)
  { Assignment assignmentx_ = (Assignment) assignments.get(_i);
    out.println("assignmentx_" + _i + " : Assignment");
  }

  for (int _i = 0; _i < skills.size(); _i++)
  { Skill skillx_ = (Skill) skills.get(_i);
    out.println("skillx_" + _i + " : Skill");
    out.println("skillx_" + _i + ".skillId = \"" + skillx_.getskillId() + "\"");
  }

  for (int _i = 0; _i < schedules.size(); _i++)
  { Schedule schedulex_ = (Schedule) schedules.get(_i);
    List schedule_consistsOf_Assignment = schedulex_.getconsistsOf();
    for (int _j = 0; _j < schedule_consistsOf_Assignment.size(); _j++)
    { out.println("assignmentx_" + assignments.indexOf(schedule_consistsOf_Assignment.get(_j)) + " : schedulex_" + _i + ".consistsOf");
    }
  }
  for (int _i = 0; _i < storys.size(); _i++)
  { Story storyx_ = (Story) storys.get(_i);
    List story_contains_Task = storyx_.getcontains();
    for (int _j = 0; _j < story_contains_Task.size(); _j++)
    { out.println("taskx_" + tasks.indexOf(story_contains_Task.get(_j)) + " : storyx_" + _i + ".contains");
    }
  }
  for (int _i = 0; _i < staffs.size(); _i++)
  { Staff staffx_ = (Staff) staffs.get(_i);
    List staff_has_Skill = staffx_.gethas();
    for (int _j = 0; _j < staff_has_Skill.size(); _j++)
    { out.println("skillx_" + skills.indexOf(staff_has_Skill.get(_j)) + " : staffx_" + _i + ".has");
    }
  }
  for (int _i = 0; _i < tasks.size(); _i++)
  { Task taskx_ = (Task) tasks.get(_i);
    List task_requires_Skill = taskx_.getrequires();
    for (int _j = 0; _j < task_requires_Skill.size(); _j++)
    { out.println("skillx_" + skills.indexOf(task_requires_Skill.get(_j)) + " : taskx_" + _i + ".requires");
    }
    List task_dependsOn_Task = taskx_.getdependsOn();
    for (int _j = 0; _j < task_dependsOn_Task.size(); _j++)
    { out.println("taskx_" + tasks.indexOf(task_dependsOn_Task.get(_j)) + " : taskx_" + _i + ".dependsOn");
    }
  }
  for (int _i = 0; _i < assignments.size(); _i++)
  { Assignment assignmentx_ = (Assignment) assignments.get(_i);
    out.println("assignmentx_" + _i + ".assignedTo = staffx_" + staffs.indexOf(((Assignment) assignments.get(_i)).getassignedTo()));
    out.println("assignmentx_" + _i + ".assignedFor = taskx_" + tasks.indexOf(((Assignment) assignments.get(_i)).getassignedFor()));
  }
    out.close(); 
  }


  public void saveXSI(String file)
  { File outfile = new File(file); 
    PrintWriter out; 
    try { out = new PrintWriter(new BufferedWriter(new FileWriter(outfile))); }
    catch (Exception e) { return; } 
    out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    out.println("<My:model xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\">");
    for (int _i = 0; _i < schedules.size(); _i++)
    { Schedule schedulex_ = (Schedule) schedules.get(_i);
       out.print("<schedules xsi:type=\"My:Schedule\"");
    out.print(" totalCost=\"" + schedulex_.gettotalCost() + "\" ");
    out.print(" duration=\"" + schedulex_.getduration() + "\" ");
    out.print(" consistsOf = \"");
    List schedule_consistsOf = schedulex_.getconsistsOf();
    for (int _j = 0; _j < schedule_consistsOf.size(); _j++)
    { out.print(" //@assignments." + assignments.indexOf(schedule_consistsOf.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < storys.size(); _i++)
    { Story storyx_ = (Story) storys.get(_i);
       out.print("<storys xsi:type=\"My:Story\"");
    out.print(" storyId=\"" + storyx_.getstoryId() + "\" ");
    out.print(" contains = \"");
    List story_contains = storyx_.getcontains();
    for (int _j = 0; _j < story_contains.size(); _j++)
    { out.print(" //@tasks." + tasks.indexOf(story_contains.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx_ = (Staff) staffs.get(_i);
       out.print("<staffs xsi:type=\"My:Staff\"");
    out.print(" staffId=\"" + staffx_.getstaffId() + "\" ");
    out.print(" costDay=\"" + staffx_.getcostDay() + "\" ");
    out.print(" has = \"");
    List staff_has = staffx_.gethas();
    for (int _j = 0; _j < staff_has.size(); _j++)
    { out.print(" //@skills." + skills.indexOf(staff_has.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < tasks.size(); _i++)
    { Task taskx_ = (Task) tasks.get(_i);
       out.print("<tasks xsi:type=\"My:Task\"");
    out.print(" taskId=\"" + taskx_.gettaskId() + "\" ");
    out.print(" duration=\"" + taskx_.getduration() + "\" ");
    out.print(" requires = \"");
    List task_requires = taskx_.getrequires();
    for (int _j = 0; _j < task_requires.size(); _j++)
    { out.print(" //@skills." + skills.indexOf(task_requires.get(_j)));
    }
    out.print("\"");
    out.print(" dependsOn = \"");
    List task_dependsOn = taskx_.getdependsOn();
    for (int _j = 0; _j < task_dependsOn.size(); _j++)
    { out.print(" //@tasks." + tasks.indexOf(task_dependsOn.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < assignments.size(); _i++)
    { Assignment assignmentx_ = (Assignment) assignments.get(_i);
       out.print("<assignments xsi:type=\"My:Assignment\"");
    out.print(" assignedTo=\"");
    out.print("//@staffs." + staffs.indexOf(((Assignment) assignments.get(_i)).getassignedTo()));
    out.print("\"");
    out.print(" assignedFor=\"");
    out.print("//@tasks." + tasks.indexOf(((Assignment) assignments.get(_i)).getassignedFor()));
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < skills.size(); _i++)
    { Skill skillx_ = (Skill) skills.get(_i);
       out.print("<skills xsi:type=\"My:Skill\"");
    out.print(" skillId=\"" + skillx_.getskillId() + "\" ");
    out.println(" />");
  }

    out.println("</My:model>");
    out.close(); 
  }



  public void addSchedule(Schedule oo) { schedules.add(oo); }

  public void addStory(Story oo) { storys.add(oo); }

  public Story getStoryByPK(String storyIdx)
  {  return (Story) storystoryIdindex.get(storyIdx); }

  public List getStoryByPK(List storyIdx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < storyIdx.size(); _i++)
    { Story storyx = getStoryByPK((String) storyIdx.get(_i));
      if (storyx != null) { res.add(storyx); }
    }
    return res; 
  }

  public void addStaff(Staff oo) { staffs.add(oo); }

  public Staff getStaffByPK(String staffIdx)
  {  return (Staff) staffstaffIdindex.get(staffIdx); }

  public List getStaffByPK(List staffIdx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < staffIdx.size(); _i++)
    { Staff staffx = getStaffByPK((String) staffIdx.get(_i));
      if (staffx != null) { res.add(staffx); }
    }
    return res; 
  }

  public void addTask(Task oo) { tasks.add(oo); }

  public Task getTaskByPK(String taskIdx)
  {  return (Task) tasktaskIdindex.get(taskIdx); }

  public List getTaskByPK(List taskIdx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < taskIdx.size(); _i++)
    { Task taskx = getTaskByPK((String) taskIdx.get(_i));
      if (taskx != null) { res.add(taskx); }
    }
    return res; 
  }

  public void addAssignment(Assignment oo) { assignments.add(oo); }

  public void addSkill(Skill oo) { skills.add(oo); }

  public Skill getSkillByPK(String skillIdx)
  {  return (Skill) skillskillIdindex.get(skillIdx); }

  public List getSkillByPK(List skillIdx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < skillIdx.size(); _i++)
    { Skill skillx = getSkillByPK((String) skillIdx.get(_i));
      if (skillx != null) { res.add(skillx); }
    }
    return res; 
  }



  public void createAllSchedule(List schedulex)
  { for (int i = 0; i < schedulex.size(); i++)
    { Schedule schedulex_x = (Schedule) schedulex.get(i);
      if (schedulex_x == null) { schedulex_x = new Schedule(); }
      schedulex.set(i,schedulex_x);
      addSchedule(schedulex_x);
    }
  }


  public Schedule createSchedule()
  { 
    Schedule schedulex = new Schedule();
    addSchedule(schedulex);
    settotalCost(schedulex,0);
    setduration(schedulex,0);
    setconsistsOf(schedulex,new Vector());

    return schedulex;
  }

  public void createAllStory(List storyx)
  { for (int i = 0; i < storyx.size(); i++)
    { Story storyx_x = (Story) storyx.get(i);
      if (storyx_x == null) { storyx_x = new Story(); }
      storyx.set(i,storyx_x);
      addStory(storyx_x);
    }
  }


  public Story createStory(String storyIdx)
  { 
    if (storystoryIdindex.get(storyIdx) != null) { return null; }
    Story storyx = new Story();
    addStory(storyx);
    setstoryId(storyx,storyIdx);
    setcontains(storyx,new Vector());
    storystoryIdindex.put(storyIdx,storyx);

    return storyx;
  }

  public void createAllStaff(List staffx)
  { for (int i = 0; i < staffx.size(); i++)
    { Staff staffx_x = (Staff) staffx.get(i);
      if (staffx_x == null) { staffx_x = new Staff(); }
      staffx.set(i,staffx_x);
      addStaff(staffx_x);
    }
  }


  public Staff createStaff(String staffIdx)
  { 
    if (staffstaffIdindex.get(staffIdx) != null) { return null; }
    Staff staffx = new Staff();
    addStaff(staffx);
    setstaffId(staffx,staffIdx);
    setcostDay(staffx,0);
    sethas(staffx,new Vector());
    staffstaffIdindex.put(staffIdx,staffx);

    return staffx;
  }

  public void createAllTask(List taskx)
  { for (int i = 0; i < taskx.size(); i++)
    { Task taskx_x = (Task) taskx.get(i);
      if (taskx_x == null) { taskx_x = new Task(); }
      taskx.set(i,taskx_x);
      addTask(taskx_x);
    }
  }


  public Task createTask(String taskIdx)
  { 
    if (tasktaskIdindex.get(taskIdx) != null) { return null; }
    Task taskx = new Task();
    addTask(taskx);
    settaskId(taskx,taskIdx);
    setduration(taskx,0);
    setrequires(taskx,new Vector());
    setdependsOn(taskx,new Vector());
    tasktaskIdindex.put(taskIdx,taskx);

    return taskx;
  }

  public void createAllAssignment(List assignmentx)
  { for (int i = 0; i < assignmentx.size(); i++)
    { Assignment assignmentx_x = (Assignment) assignmentx.get(i);
      if (assignmentx_x == null) { assignmentx_x = new Assignment(); }
      assignmentx.set(i,assignmentx_x);
      addAssignment(assignmentx_x);
    }
  }


  public Assignment createAssignment(Staff assignedTox,Task assignedForx)
  { 
    Assignment assignmentx = new Assignment(assignedTox,assignedForx);
    addAssignment(assignmentx);
    setassignedTo(assignmentx,assignedTox);
    setassignedFor(assignmentx,assignedForx);

    return assignmentx;
  }

  public void createAllSkill(List skillx)
  { for (int i = 0; i < skillx.size(); i++)
    { Skill skillx_x = (Skill) skillx.get(i);
      if (skillx_x == null) { skillx_x = new Skill(); }
      skillx.set(i,skillx_x);
      addSkill(skillx_x);
    }
  }


  public Skill createSkill(String skillIdx)
  { 
    if (skillskillIdindex.get(skillIdx) != null) { return null; }
    Skill skillx = new Skill();
    addSkill(skillx);
    setskillId(skillx,skillIdx);
    skillskillIdindex.put(skillIdx,skillx);

    return skillx;
  }


public void settotalCost(Schedule schedulex, int totalCost_x) 
  { schedulex.settotalCost(totalCost_x);
    }


public void setduration(Schedule schedulex, int duration_x) 
  { schedulex.setduration(duration_x);
    }


  public void setconsistsOf(Schedule schedulex, List consistsOfxx) 
  {   List _oldconsistsOfxx = schedulex.getconsistsOf();
  for (int _i = 0; _i < consistsOfxx.size(); _i++)
  { Assignment _xx = (Assignment) consistsOfxx.get(_i);
    if (_oldconsistsOfxx.contains(_xx)) { }
    else { Schedule.removeAllconsistsOf(schedules, _xx); }
  }
    schedulex.setconsistsOf(consistsOfxx);
      }


  public void addconsistsOf(Schedule schedulex, Assignment consistsOfxx) 
  { if (schedulex.getconsistsOf().contains(consistsOfxx)) { return; }
    Schedule.removeAllconsistsOf(schedules,consistsOfxx);
    schedulex.addconsistsOf(consistsOfxx);
    }


  public void removeconsistsOf(Schedule schedulex, Assignment consistsOfxx) 
  { schedulex.removeconsistsOf(consistsOfxx);
    }


 public void unionconsistsOf(Schedule schedulex,List consistsOfx)
  { for (int _i = 0; _i < consistsOfx.size(); _i++)
    { Assignment assignmentxconsistsOf = (Assignment) consistsOfx.get(_i);
      addconsistsOf(schedulex,assignmentxconsistsOf);
     } } 


 public void subtractconsistsOf(Schedule schedulex,List consistsOfx)
  { for (int _i = 0; _i < consistsOfx.size(); _i++)
    { Assignment assignmentxconsistsOf = (Assignment) consistsOfx.get(_i);
      removeconsistsOf(schedulex,assignmentxconsistsOf);
     } } 


public void setstoryId(Story storyx, String storyId_x) 
  { if (storystoryIdindex.get(storyId_x) != null) { return; }
  storystoryIdindex.remove(storyx.getstoryId());
  storyx.setstoryId(storyId_x);
  storystoryIdindex.put(storyId_x,storyx);
    }


  public void setcontains(Story storyx, List containsxx) 
  {   List _oldcontainsxx = storyx.getcontains();
  for (int _i = 0; _i < containsxx.size(); _i++)
  { Task _xx = (Task) containsxx.get(_i);
    if (_oldcontainsxx.contains(_xx)) { }
    else { Story.removeAllcontains(storys, _xx); }
  }
    storyx.setcontains(containsxx);
      }


  public void setcontains(Story storyx, int _ind, Task taskx) 
  { storyx.setcontains(_ind,taskx); }
  
  public void addcontains(Story storyx, Task containsxx) 
  {   Story.removeAllcontains(storys,containsxx);
    storyx.addcontains(containsxx);
    }


  public void removecontains(Story storyx, Task containsxx) 
  { storyx.removecontains(containsxx);
    }


 public void unioncontains(Story storyx,List containsx)
  { for (int _i = 0; _i < containsx.size(); _i++)
    { Task taskxcontains = (Task) containsx.get(_i);
      addcontains(storyx,taskxcontains);
     } } 


 public void subtractcontains(Story storyx,List containsx)
  { for (int _i = 0; _i < containsx.size(); _i++)
    { Task taskxcontains = (Task) containsx.get(_i);
      removecontains(storyx,taskxcontains);
     } } 


public void setstaffId(Staff staffx, String staffId_x) 
  { if (staffstaffIdindex.get(staffId_x) != null) { return; }
  staffstaffIdindex.remove(staffx.getstaffId());
  staffx.setstaffId(staffId_x);
  staffstaffIdindex.put(staffId_x,staffx);
    }


public void setcostDay(Staff staffx, int costDay_x) 
  { staffx.setcostDay(costDay_x);
    }


  public void sethas(Staff staffx, List hasxx) 
  {     staffx.sethas(hasxx);
      }


  public void addhas(Staff staffx, Skill hasxx) 
  { if (staffx.gethas().contains(hasxx)) { return; }
      staffx.addhas(hasxx);
    }


  public void removehas(Staff staffx, Skill hasxx) 
  { staffx.removehas(hasxx);
    }


 public void unionhas(Staff staffx,List hasx)
  { for (int _i = 0; _i < hasx.size(); _i++)
    { Skill skillxhas = (Skill) hasx.get(_i);
      addhas(staffx,skillxhas);
     } } 


 public void subtracthas(Staff staffx,List hasx)
  { for (int _i = 0; _i < hasx.size(); _i++)
    { Skill skillxhas = (Skill) hasx.get(_i);
      removehas(staffx,skillxhas);
     } } 


public void settaskId(Task taskx, String taskId_x) 
  { if (tasktaskIdindex.get(taskId_x) != null) { return; }
  tasktaskIdindex.remove(taskx.gettaskId());
  taskx.settaskId(taskId_x);
  tasktaskIdindex.put(taskId_x,taskx);
    }


public void setduration(Task taskx, int duration_x) 
  { taskx.setduration(duration_x);
    }


  public void setrequires(Task taskx, List requiresxx) 
  {     taskx.setrequires(requiresxx);
      }


  public void addrequires(Task taskx, Skill requiresxx) 
  { if (taskx.getrequires().contains(requiresxx)) { return; }
      taskx.addrequires(requiresxx);
    }


  public void removerequires(Task taskx, Skill requiresxx) 
  { taskx.removerequires(requiresxx);
    }


 public void unionrequires(Task taskx,List requiresx)
  { for (int _i = 0; _i < requiresx.size(); _i++)
    { Skill skillxrequires = (Skill) requiresx.get(_i);
      addrequires(taskx,skillxrequires);
     } } 


 public void subtractrequires(Task taskx,List requiresx)
  { for (int _i = 0; _i < requiresx.size(); _i++)
    { Skill skillxrequires = (Skill) requiresx.get(_i);
      removerequires(taskx,skillxrequires);
     } } 


  public void setdependsOn(Task taskx, List dependsOnxx) 
  {     taskx.setdependsOn(dependsOnxx);
      }


  public void adddependsOn(Task taskx, Task dependsOnxx) 
  { if (taskx.getdependsOn().contains(dependsOnxx)) { return; }
      taskx.adddependsOn(dependsOnxx);
    }


  public void removedependsOn(Task taskx, Task dependsOnxx) 
  { taskx.removedependsOn(dependsOnxx);
    }


 public void uniondependsOn(Task taskx,List dependsOnx)
  { for (int _i = 0; _i < dependsOnx.size(); _i++)
    { Task taskxdependsOn = (Task) dependsOnx.get(_i);
      adddependsOn(taskx,taskxdependsOn);
     } } 


 public void subtractdependsOn(Task taskx,List dependsOnx)
  { for (int _i = 0; _i < dependsOnx.size(); _i++)
    { Task taskxdependsOn = (Task) dependsOnx.get(_i);
      removedependsOn(taskx,taskxdependsOn);
     } } 


  public void setassignedTo(Assignment assignmentx, Staff assignedToxx) 
  {   if (assignmentx.getassignedTo() == assignedToxx) { return; }
    assignmentx.setassignedTo(assignedToxx);
      }


  public void setassignedFor(Assignment assignmentx, Task assignedForxx) 
  {   if (assignmentx.getassignedFor() == assignedForxx) { return; }
    assignmentx.setassignedFor(assignedForxx);
      }


public void setskillId(Skill skillx, String skillId_x) 
  { if (skillskillIdindex.get(skillId_x) != null) { return; }
  skillskillIdindex.remove(skillx.getskillId());
  skillx.setskillId(skillId_x);
  skillskillIdindex.put(skillId_x,skillx);
    }





  public void killAllSchedule(List schedulexx)
  { for (int _i = 0; _i < schedulexx.size(); _i++)
    { killSchedule((Schedule) schedulexx.get(_i)); }
  }

  public void killSchedule(Schedule schedulexx)
  { if (schedulexx == null) { return; }
   schedules.remove(schedulexx);
  }



  public void killAllStory(List storyxx)
  { for (int _i = 0; _i < storyxx.size(); _i++)
    { killStory((Story) storyxx.get(_i)); }
  }

  public void killStory(Story storyxx)
  { if (storyxx == null) { return; }
   storys.remove(storyxx);
    storystoryIdindex.remove(storyxx.getstoryId());
  }



  public void killAllStaff(List staffxx)
  { for (int _i = 0; _i < staffxx.size(); _i++)
    { killStaff((Staff) staffxx.get(_i)); }
  }

  public void killStaff(Staff staffxx)
  { if (staffxx == null) { return; }
   staffs.remove(staffxx);
    Vector _1removedassignedToAssignment = new Vector();
    Vector _1qrangeassignedToAssignment = new Vector();
    _1qrangeassignedToAssignment.addAll(assignments);
    for (int _i = 0; _i < _1qrangeassignedToAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _1qrangeassignedToAssignment.get(_i);
      if (assignmentx != null && staffxx.equals(assignmentx.getassignedTo()))
      { _1removedassignedToAssignment.add(assignmentx);
        assignmentx.setassignedTo(null);
      }
    }
    staffstaffIdindex.remove(staffxx.getstaffId());
    for (int _i = 0; _i < _1removedassignedToAssignment.size(); _i++)
    { killAssignment((Assignment) _1removedassignedToAssignment.get(_i)); }
  }



  public void killAllTask(List taskxx)
  { for (int _i = 0; _i < taskxx.size(); _i++)
    { killTask((Task) taskxx.get(_i)); }
  }

  public void killTask(Task taskxx)
  { if (taskxx == null) { return; }
   tasks.remove(taskxx);
    Vector _1removedassignedForAssignment = new Vector();
    Vector _1qrangecontainsStory = new Vector();
    _1qrangecontainsStory.addAll(storys);
    for (int _i = 0; _i < _1qrangecontainsStory.size(); _i++)
    { Story storyx = (Story) _1qrangecontainsStory.get(_i);
      if (storyx != null && storyx.getcontains().contains(taskxx))
      { removecontains(storyx,taskxx); }
    }
    Vector _1qrangeassignedForAssignment = new Vector();
    _1qrangeassignedForAssignment.addAll(assignments);
    for (int _i = 0; _i < _1qrangeassignedForAssignment.size(); _i++)
    { Assignment assignmentx = (Assignment) _1qrangeassignedForAssignment.get(_i);
      if (assignmentx != null && taskxx.equals(assignmentx.getassignedFor()))
      { _1removedassignedForAssignment.add(assignmentx);
        assignmentx.setassignedFor(null);
      }
    }
    Vector _1qrangedependsOnTask = new Vector();
    _1qrangedependsOnTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangedependsOnTask.size(); _i++)
    { Task taskx = (Task) _1qrangedependsOnTask.get(_i);
      if (taskx != null && taskx.getdependsOn().contains(taskxx))
      { removedependsOn(taskx,taskxx); }
    }
    tasktaskIdindex.remove(taskxx.gettaskId());
    for (int _i = 0; _i < _1removedassignedForAssignment.size(); _i++)
    { killAssignment((Assignment) _1removedassignedForAssignment.get(_i)); }
  }



  public void killAllAssignment(List assignmentxx)
  { for (int _i = 0; _i < assignmentxx.size(); _i++)
    { killAssignment((Assignment) assignmentxx.get(_i)); }
  }

  public void killAssignment(Assignment assignmentxx)
  { if (assignmentxx == null) { return; }
   assignments.remove(assignmentxx);
    Vector _1qrangeconsistsOfSchedule = new Vector();
    _1qrangeconsistsOfSchedule.addAll(schedules);
    for (int _i = 0; _i < _1qrangeconsistsOfSchedule.size(); _i++)
    { Schedule schedulex = (Schedule) _1qrangeconsistsOfSchedule.get(_i);
      if (schedulex != null && schedulex.getconsistsOf().contains(assignmentxx))
      { removeconsistsOf(schedulex,assignmentxx); }
    }
  }



  public void killAllSkill(List skillxx)
  { for (int _i = 0; _i < skillxx.size(); _i++)
    { killSkill((Skill) skillxx.get(_i)); }
  }

  public void killSkill(Skill skillxx)
  { if (skillxx == null) { return; }
   skills.remove(skillxx);
    Vector _1qrangerequiresTask = new Vector();
    _1qrangerequiresTask.addAll(tasks);
    for (int _i = 0; _i < _1qrangerequiresTask.size(); _i++)
    { Task taskx = (Task) _1qrangerequiresTask.get(_i);
      if (taskx != null && taskx.getrequires().contains(skillxx))
      { removerequires(taskx,skillxx); }
    }
    Vector _1qrangehasStaff = new Vector();
    _1qrangehasStaff.addAll(staffs);
    for (int _i = 0; _i < _1qrangehasStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangehasStaff.get(_i);
      if (staffx != null && staffx.gethas().contains(skillxx))
      { removehas(staffx,skillxx); }
    }
    skillskillIdindex.remove(skillxx.getskillId());
  }




   
}



