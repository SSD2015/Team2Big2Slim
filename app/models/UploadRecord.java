package models;

/**
 * Created by nathakorn on 5/6/15 AD.
 */
import play.db.ebean.Model;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.apache.commons.collections.map.MultiKeyMap;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Iterator;
import java.util.List;

import javax.persistence.*;
import javax.xml.transform.Result;

import play.data.validation.Constraints.Required;
import play.db.ebean.*;
import java.util.List;

@Entity
public class UploadRecord extends Model {
    @Id
    public int ID;
    public int projectID;
    public String type;
    @Lob
    private byte[] data;

    public static Finder<Integer, UploadRecord> find = new Finder<Integer, UploadRecord>(
            Integer.class, UploadRecord.class
    );

    public int getProjectID() {
        return this.projectID;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getID() {
        return this.ID;

    }
    public void changeData(byte[] data){
        this.data = data;
    }

    public String getType() {
        return this.type;
    }

    public UploadRecord(int projectID, File pic, String type) {
        this.projectID = projectID;
        this.data = new byte[(int) pic.length()];
        this.type = type;
        InputStream inStream = null;
        try {
            inStream = new BufferedInputStream(new FileInputStream(pic));
            inStream.read(this.data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inStream != null) {
                try {
                    inStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        this.save();
    }
}
