package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by momomomomo on 4/8/2015.
 */
@Entity
public class VotingCriteria extends Model {
    @Id
    public int ID;
    public String criteriaName;

    public static Finder<Integer, VotingCriteria> find = new Finder<Integer,VotingCriteria>(
        Integer.class, VotingCriteria.class
    );

    public static void create(int id, String name) {
        VotingCriteria vc = new VotingCriteria();
        vc.ID = id;
        vc.criteriaName = name;
        vc.save();
    }

    public static int getNum() {
        return 1;
    }

    public static String getAllVotingCriteriaName() {
        List<VotingCriteria> list = VotingCriteria.find.all();
        String nameList = "";
        for (int i = 0 ; i < list.size() ; i++) {
            nameList += list.get(i).criteriaName;
            if (i+1 < list.size())
                nameList += ",";
        }
        return nameList;
    }

    public int getNumberOfVotingRecord() {
        return VotingRecord.getTotalVote(this.ID);
    }

    public String getDashName() {
        String name = this.criteriaName;
        name = name.replaceAll(" ", "-");
        return name;
    }
}
