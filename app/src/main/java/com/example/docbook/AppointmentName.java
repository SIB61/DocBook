package com.example.docbook;

public class AppointmentName {
    private String patientId,doctorId,patientName,doctorName,patientAge,patientGender,patientProblemInfo,date,schedule;

    public AppointmentName(String patientId, String doctorId, String patientName, String doctorName, String patientAge, String patientGender, String patientProblemInfo, String date, String schedule) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.patientAge = patientAge;
        this.patientGender = patientGender;
        this.patientProblemInfo = patientProblemInfo;
        this.date = date;
        this.schedule = schedule;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientProblemInfo() {
        return patientProblemInfo;
    }

    public void setPatientProblemInfo(String patientProblemInfo) {
        this.patientProblemInfo = patientProblemInfo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "AppointmentName{" +
                "patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", patientAge='" + patientAge + '\'' +
                ", patientGender='" + patientGender + '\'' +
                ", patientProblemInfo='" + patientProblemInfo + '\'' +
                ", date='" + date + '\'' +
                ", schedule='" + schedule + '\'' +
                '}';
    }
}
