package info.lavait.imgupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("grzbiet-image-upload-s3");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
