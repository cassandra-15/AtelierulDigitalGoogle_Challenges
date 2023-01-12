package Design_Patterns_3.Challenge6;

public class Person {
    private String name;
    private String job;
    private String university;
    private boolean drivingLicense;
    private boolean isMaried;


    public Person(Builder builder ) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMaried = builder.isMaried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense=" + (drivingLicense ? "Yes":"No") +
                ", isMaried=" + (isMaried ? "Yes":"No") +
                '}';
    }

    public static class Builder
    {
        private String name;
        private String job;
        private String university;
        private boolean drivingLicense;
        private boolean isMaried;

        public Builder(String name)
        {
            this.name=name;
        }

        public Builder setJob(String jobName)
        {
            this.job=jobName;
            return this;
        }

        public Builder setUniversity(String universityName)
        {
            this.university=universityName;
            return this;
        }

        public Builder setDrivingLicense(boolean drivingLicenseOption)
        {
            this.drivingLicense=drivingLicenseOption;
            return this;
        }

        public Builder setIsMaried(boolean isMariedOption)
        {
            this.isMaried=isMariedOption;
            return this;
        }

        public Person build()
        {
            return new Person(this);
        }

    }

}
