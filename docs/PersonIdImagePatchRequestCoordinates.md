

# PersonIdImagePatchRequestCoordinates

The coordinates to crop the image.<p>If `PERSON_PROFILE` is selected, the image will be stretched to an aspect ratio of 1:1 in IHR platform. Hence it is recommended to crop the image with an aspect ratio of 1:1 to avoid distortions. As an example for a `3000x4000` image to cropped to 1:1, the height can be modified to a value of 3000px which corresponds to the ratio `height=widthpx/heightpx=3000/4000=0.75`. For the height of image to be cropped in the center, vertical offset can be defined as `y=(1-height)/2=0.125`. With the following example, coordinates of `{ x: 0, y: 0.125, width: 1, height: 0.75}` will result in a square image that is cropped from the center.</p><p>If `PROFILE_COVER` is selected, the image will be stretched to an aspect ratio of 3:1 in IHR platform. As an example to avoid distortions, we can use the following formula for the new height `newHeightpx=widthpx/3`. The new height ratio will be defined as `height=newHeightpx/heightpx`. The vertical offset can be adjusted using `y=(1-height)/2` for the image height to be cropped from the center.</p>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**height** | **Integer** | the multiple to crop the height of the image to (e.g. 0.5 will half the height) |  |
|**width** | **Integer** | the multiple to crop the width of the image to (e.g. 0.5 will half the width) |  |
|**x** | **Integer** | the multiple to offset the x crop (e.g. 0.5 will crop to show the right side of the image if the width is also 0.5) |  |
|**y** | **Integer** | the multiple to offset the y crop (e.g. 0.5 will crop to show the bottom of the image if the height is also 0.5) |  |



