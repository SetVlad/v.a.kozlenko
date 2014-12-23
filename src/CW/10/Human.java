import java.util.Date;

/**
 * Created by systemadministrator on 18.12.2014.
 */
public class Human {
    private String name;
    private Date birth;

    public Human (String name, Date birth) {
        this.name = name;
        this.birth= birth;
    }

    @Override
    public int hashCode(){
        return new HashCodeBuilder(17,31).append(name).append(birth).toHashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(obj==this) return true;
        if(!(obj instanceof Human)) return false;
        Human rhs=(Human)obj;
        return new EqualsBuilder().append(name, rhs.name).append(birth,rhs.birth).isEquals();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Human o = (Human) super.clone();
        o.birth = (Date) birth.clone();
        return o;
    }

    @Override
    public String toString() {
        return name + ", " + birth;
    }

}
