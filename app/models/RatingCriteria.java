package models;

import org.apache.commons.collections.map.MultiKeyMap;
import play.db.ebean.Model;
import play.twirl.api.JavaScript;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.*;

/**
 * Created by momomomomo on 4/8/2015.
 */
@Entity
public class RatingCriteria extends Model {
    @Id
    public int ID;
    public String criteriaName;

    public static Finder<Integer, RatingCriteria> find = new Finder<Integer,RatingCriteria>(
        Integer.class, RatingCriteria.class
    );

    public static void create(int id, String name) {
        RatingCriteria rc = new RatingCriteria();
        rc.ID = id;
        rc.criteriaName = name;
        rc.save();
    }

    public static List<RatingCriteria> getAllRatingCriteria() {
        return RatingCriteria.find.all();
    }

    public String getDashName() {
        String name = this.criteriaName;
        name = name.replaceAll(" ", "-");
        return name;
    }

    public int findIdInProjectList(List<Project> projectList, double score) {
        for (int i = 0 ; i < projectList.size() ; i++) {
            RatingRecord.ScoreSummarize ss =(RatingRecord.ScoreSummarize)RatingRecord.summarize().get(projectList.get(i), this);
            double scoreT = ss.averageScore;
            if (score == scoreT) {
                int id = projectList.get(i).getID();
                projectList.remove(i);
                return id;
            }
        }
        return -99;
    }

    public ArrayList<Double> getRateScoreOrderList() {
        MultiKeyMap mkm = RatingRecord.summarize();
        List<Project> projectList = Project.find.all();
        ArrayList<Double> scoreList = new ArrayList<Double>();
        for (Project project : projectList) {
            RatingRecord.ScoreSummarize ss = (RatingRecord.ScoreSummarize)mkm.get(project, this);
            double avg = ss.averageScore;
            scoreList.add(avg);
        }
        Collections.sort(scoreList);
        Collections.reverse(scoreList);
        return scoreList;
    }

    public String getRateScoreOrderNameList() {
        MultiKeyMap mkm = RatingRecord.summarize();
        List<Project> projectList = Project.find.all();
        ArrayList<Double> scoreList = new ArrayList<Double>();
        for (Project project : projectList) {
            RatingRecord.ScoreSummarize ss = (RatingRecord.ScoreSummarize)mkm.get(project, this);
            double avg = ss.averageScore;
            scoreList.add(avg);
        }
        Collections.sort(scoreList);
        Collections.reverse(scoreList);
        String s = "";
        for (int i = 0 ; i < scoreList.size() ; i++) {
            int id = findIdInProjectList(projectList, scoreList.get(i));
            if (i+1 < scoreList.size())
                s += Project.find.byId(id).projectName +",";
            else
                s += Project.find.byId(id).projectName;
        }
        return s;
    }
}
