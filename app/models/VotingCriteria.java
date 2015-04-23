package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
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

    public static List<VotingCriteria> getAllVotingCriteria() {
        return VotingCriteria.find.all();
    }

    public int getNumberOfVotingRecord() {
        return VotingRecord.getTotalVote(this.ID);
    }
}
