package jobsheet3practice;

public class MataKuliah {

    public String code_material, name_material, lecture_name;
    public int class_quota;
    public String student_list;

    public MataKuliah() {
    }

    public void getNewCode(String new_code) {
        code_material = new_code;
    }

    public void getNewMaterial(String new_material) {
        name_material = new_material;
    }

    public void getNewLecture(String new_lecture) {
        lecture_name = new_lecture;
    }

    int increase_kuota(int new_quota) {
        return class_quota - new_quota;
    }

    int decrease_kuota(int new_quota) {
        return class_quota - new_quota;
    }

}
