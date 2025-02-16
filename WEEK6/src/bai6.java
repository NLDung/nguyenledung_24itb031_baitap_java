import java.util.Date;

class Vacation {
    private int length;
    private Date date;
    private String place;

    public Vacation() {
        this.length = 0;
        this.date = new Date();
        this.place = "Unknown";
    }

    public Vacation(String place, Date date, int length) {
        this.place = place;
        this.date = date;
        this.length = length;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPlace() {
        return place;
    }

    public int getLength() {
        return length;
    }

    public Date getDate() {
        return date;
    }


    public String toString() {
        return "Kỳ nghỉ đến: " + place + "\n" +
                "Ngày bắt đầu: " + date.toString() + "\n" +
                "Số ngày: " + length + " ngày";
    }
}

public class bai6 {
    public static void main(String[] args) {
        Vacation vacation = new Vacation("Phú Quốc", new Date(), 7);
        System.out.println(vacation.toString());

        vacation.setPlace("Đà Nẵng");
        vacation.setLength(10);

        System.out.println("\nSau khi cập nhật:");
        System.out.println(vacation.toString());
    }
}
