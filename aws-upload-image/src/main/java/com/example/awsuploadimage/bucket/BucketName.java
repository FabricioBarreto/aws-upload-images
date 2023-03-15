package com.example.awsuploadimage.bucket;

public enum BucketName {

    PROFILE_IMAGE("fabricio-image-upload-123");

    private final String BucketName;

    BucketName(String bucketName) {
        BucketName = bucketName;
    }

    public String getBucketName() {
        return BucketName;
    }
}
