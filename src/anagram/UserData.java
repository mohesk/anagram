package anagram;



//imports
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Key;
//class definition
@PersistenceCapable
public class UserData {
//the identifier for the object as we will be using the user key for this
//we need to use a key object here
@PrimaryKey
@Persistent
private Key id;
//the timezone offset for this user
@Persistent
private int offset;
//anything below this line is for our convenience and will not be used by
//JDO
//setter and getter for the id
public void setID(final Key id) { this.id = id; }
public Key id() { return id; }
//setter and getter for the offset
public void setOffset(final int offset) { this.offset = offset; }
public int offset() { return offset; }
}