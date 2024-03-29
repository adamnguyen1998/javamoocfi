

public class SimpleDate
{
    
    private int day;
    private int month;
    private int year;
    
    SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public boolean equals(Object object){
        
        if (this == object){
            return true;
        }
        
        if (!(object instanceof SimpleDate)){
            return false;
        }
        
        SimpleDate comparedObject = (SimpleDate) object;
        
        return (this.day == comparedObject.day && this.month == comparedObject.month && this.year == comparedObject.year);
        
        
    }
    
        @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }
    
    
    
    
    
	public static void main(String[] args) {
		SimpleDate d = new SimpleDate(1, 2, 2000);
System.out.println(d.equals("heh"));
System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
	}
}
