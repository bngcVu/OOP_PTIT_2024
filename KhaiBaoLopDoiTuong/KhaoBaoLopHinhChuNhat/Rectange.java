package KHAI_BAO_LOP_DOI_TUONG.KhaoBaoLopHinhChuNhat;

public class Rectange {
    private double width;
    private double height;
    private String color;

    // Tạo hình chữ nhật
    public Rectange() {
        width = height = 1;
    }

    // Tạo hình chữ nhật có chiều dài, chiều rộng xác định
    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }

    // Trả về chiều rộng
    public double getWidth() {
        return width;
    }

    // Trả về chiều rộng mới
    public void setWidth(double width) {
        this.width = width;
    }

    // Trả về chiều dài
    public double getHeight() {
        return height;
    }

    // Trả về chiều dài mới
    public void setHeight(double height) {
        this.height = height;
    }

    // Trả về màu của Rectange
    public String getColor() {
        return color;
    }
    // Trả về màu mới của Rectange
    public void setColor(String color) {
        this.color = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public double findArea() {return width * height;
    }

    public double findPerimeter() {
        return (width + height) * 2;
    }



    @Override
    public String toString()
    {
        if(width <= 0 || height <= 0) return "INVALID";
        return (int)this.findPerimeter() + " " + (int)this.findArea() + " " + color;
    }
}
