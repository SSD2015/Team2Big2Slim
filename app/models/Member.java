package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by nathakorn on 3/27/15 AD.
 */
@Entity
public class Member extends Model {
    @Id
        public Long id;
    @Constraints.Required
        public String name;
        public String surname;
        public String kuNo;
        public Long projectId;

    public static void create(long id,String name,String surname,String kuNo,Long projectId){
        Member member = new Member();
        member.id = id;
        member.name = name;
        member.surname = surname;
        member.kuNo = kuNo;
        member.projectId = projectId;
        member.save();
    }
    public static Finder<Long, Member> find = new Finder<Long, Member>(Long.class, Member.class);
}
