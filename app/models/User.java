package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 * Created by nicole on 3/23/15 AD.
 */
@Entity
public class User extends Model{
    @Id
    protected int ID;
    public String username;
    public String password;
    public String name;
    public int projectId;
    public String kuNo;

    public static Finder<Integer, User> find = new Finder<Integer,User>(
            Integer.class, User.class
    );

    public static void create(int id, String username, String password, String name, int projectId, String kuNo){
        User user = new User();
        user.ID = id;
        user.username = username;
        user.password = BCrypt.hashpw(password, BCrypt.gensalt());
        user.name = name;
        user.projectId = projectId;
        user.kuNo = kuNo;
        user.save();
    }

    public static Object authenticate(String username, String passwd) {
         User user = User.find.where().eq("username", username).findUnique();
        if (user == null) return null;
        if ( BCrypt.checkpw(passwd, user.password) ) return user;
        return null;
    }

    public boolean hasVoted(int criteriaId) {
        VotingRecord oldVote = VotingRecord.find.where().eq("userID", ID).eq("criteriaID", criteriaId).findUnique();
        if (oldVote == null)
            return false;
        else
            return true;
    }

    //return list of integer array which are in this form {projectID, criteriaID}
    public ArrayList<int[]> getVotedList() {
        List<VotingRecord> voteList = VotingRecord.find.where().eq("userID", ID).findList();
        ArrayList<int[]> a = new ArrayList<int[]>();
        for (VotingRecord record : voteList) {
            int[] x = {record.projectID, record.criteriaID};
            a.add(x);
            System.out.println(record.projectID+" "+record.criteriaID);
        }
        return a;
    }

    public int getID() {
        return ID;
    }

}
