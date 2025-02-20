/*
 * intelliHR Public API
 * You can find developer's guide and more documentation on [https://developers.intellihr.io](https://developers.intellihr.io)
 *
 * The version of the OpenAPI document: V1
 * Contact: support@intellihr.co
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * The coordinates to crop the image.&lt;p&gt;If &#x60;PERSON_PROFILE&#x60; is selected, the image will be stretched to an aspect ratio of 1:1 in IHR platform. Hence it is recommended to crop the image with an aspect ratio of 1:1 to avoid distortions. As an example for a &#x60;3000x4000&#x60; image to cropped to 1:1, the height can be modified to a value of 3000px which corresponds to the ratio &#x60;height&#x3D;widthpx/heightpx&#x3D;3000/4000&#x3D;0.75&#x60;. For the height of image to be cropped in the center, vertical offset can be defined as &#x60;y&#x3D;(1-height)/2&#x3D;0.125&#x60;. With the following example, coordinates of &#x60;{ x: 0, y: 0.125, width: 1, height: 0.75}&#x60; will result in a square image that is cropped from the center.&lt;/p&gt;&lt;p&gt;If &#x60;PROFILE_COVER&#x60; is selected, the image will be stretched to an aspect ratio of 3:1 in IHR platform. As an example to avoid distortions, we can use the following formula for the new height &#x60;newHeightpx&#x3D;widthpx/3&#x60;. The new height ratio will be defined as &#x60;height&#x3D;newHeightpx/heightpx&#x60;. The vertical offset can be adjusted using &#x60;y&#x3D;(1-height)/2&#x60; for the image height to be cropped from the center.&lt;/p&gt;
 */
@ApiModel(description = "The coordinates to crop the image.<p>If `PERSON_PROFILE` is selected, the image will be stretched to an aspect ratio of 1:1 in IHR platform. Hence it is recommended to crop the image with an aspect ratio of 1:1 to avoid distortions. As an example for a `3000x4000` image to cropped to 1:1, the height can be modified to a value of 3000px which corresponds to the ratio `height=widthpx/heightpx=3000/4000=0.75`. For the height of image to be cropped in the center, vertical offset can be defined as `y=(1-height)/2=0.125`. With the following example, coordinates of `{ x: 0, y: 0.125, width: 1, height: 0.75}` will result in a square image that is cropped from the center.</p><p>If `PROFILE_COVER` is selected, the image will be stretched to an aspect ratio of 3:1 in IHR platform. As an example to avoid distortions, we can use the following formula for the new height `newHeightpx=widthpx/3`. The new height ratio will be defined as `height=newHeightpx/heightpx`. The vertical offset can be adjusted using `y=(1-height)/2` for the image height to be cropped from the center.</p>")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PersonIdImagePatchRequestCoordinates {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height = 1;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width = 1;

  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private Integer x = 0;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private Integer y = 0;

  public PersonIdImagePatchRequestCoordinates() {
  }

  public PersonIdImagePatchRequestCoordinates height(Integer height) {
    
    
    
    
    this.height = height;
    return this;
  }

   /**
   * the multiple to crop the height of the image to (e.g. 0.5 will half the height)
   * @return height
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "the multiple to crop the height of the image to (e.g. 0.5 will half the height)")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    
    
    
    this.height = height;
  }


  public PersonIdImagePatchRequestCoordinates width(Integer width) {
    
    
    
    
    this.width = width;
    return this;
  }

   /**
   * the multiple to crop the width of the image to (e.g. 0.5 will half the width)
   * @return width
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "the multiple to crop the width of the image to (e.g. 0.5 will half the width)")

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    
    
    
    this.width = width;
  }


  public PersonIdImagePatchRequestCoordinates x(Integer x) {
    
    
    
    
    this.x = x;
    return this;
  }

   /**
   * the multiple to offset the x crop (e.g. 0.5 will crop to show the right side of the image if the width is also 0.5)
   * @return x
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "the multiple to offset the x crop (e.g. 0.5 will crop to show the right side of the image if the width is also 0.5)")

  public Integer getX() {
    return x;
  }


  public void setX(Integer x) {
    
    
    
    this.x = x;
  }


  public PersonIdImagePatchRequestCoordinates y(Integer y) {
    
    
    
    
    this.y = y;
    return this;
  }

   /**
   * the multiple to offset the y crop (e.g. 0.5 will crop to show the bottom of the image if the height is also 0.5)
   * @return y
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "the multiple to offset the y crop (e.g. 0.5 will crop to show the bottom of the image if the height is also 0.5)")

  public Integer getY() {
    return y;
  }


  public void setY(Integer y) {
    
    
    
    this.y = y;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PersonIdImagePatchRequestCoordinates instance itself
   */
  public PersonIdImagePatchRequestCoordinates putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonIdImagePatchRequestCoordinates personIdImagePatchRequestCoordinates = (PersonIdImagePatchRequestCoordinates) o;
    return Objects.equals(this.height, personIdImagePatchRequestCoordinates.height) &&
        Objects.equals(this.width, personIdImagePatchRequestCoordinates.width) &&
        Objects.equals(this.x, personIdImagePatchRequestCoordinates.x) &&
        Objects.equals(this.y, personIdImagePatchRequestCoordinates.y)&&
        Objects.equals(this.additionalProperties, personIdImagePatchRequestCoordinates.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width, x, y, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonIdImagePatchRequestCoordinates {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("height");
    openapiFields.add("width");
    openapiFields.add("x");
    openapiFields.add("y");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("height");
    openapiRequiredFields.add("width");
    openapiRequiredFields.add("x");
    openapiRequiredFields.add("y");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonIdImagePatchRequestCoordinates
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonIdImagePatchRequestCoordinates.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonIdImagePatchRequestCoordinates is not found in the empty JSON string", PersonIdImagePatchRequestCoordinates.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PersonIdImagePatchRequestCoordinates.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonIdImagePatchRequestCoordinates.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonIdImagePatchRequestCoordinates' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonIdImagePatchRequestCoordinates> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonIdImagePatchRequestCoordinates.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonIdImagePatchRequestCoordinates>() {
           @Override
           public void write(JsonWriter out, PersonIdImagePatchRequestCoordinates value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonIdImagePatchRequestCoordinates read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PersonIdImagePatchRequestCoordinates instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonIdImagePatchRequestCoordinates given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonIdImagePatchRequestCoordinates
  * @throws IOException if the JSON string is invalid with respect to PersonIdImagePatchRequestCoordinates
  */
  public static PersonIdImagePatchRequestCoordinates fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonIdImagePatchRequestCoordinates.class);
  }

 /**
  * Convert an instance of PersonIdImagePatchRequestCoordinates to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

