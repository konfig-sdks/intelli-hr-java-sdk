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
 * Contains information related to the pagination of the response
 */
@ApiModel(description = "Contains information related to the pagination of the response")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DefaultRemunerationComponentsListMetaPagination {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_PER_PAGE = "per_page";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Integer perPage;

  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public DefaultRemunerationComponentsListMetaPagination() {
  }

  public DefaultRemunerationComponentsListMetaPagination total(Integer total) {
    if (total != null && total < 0) {
      throw new IllegalArgumentException("Invalid value for total. Must be greater than or equal to 0.");
    }
    
    
    
    this.total = total;
    return this;
  }

   /**
   * Total items count
   * minimum: 0
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "Total items count")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    if (total != null && total < 0) {
      throw new IllegalArgumentException("Invalid value for total. Must be greater than or equal to 0.");
    }
    
    
    this.total = total;
  }


  public DefaultRemunerationComponentsListMetaPagination count(Integer count) {
    if (count != null && count < 0) {
      throw new IllegalArgumentException("Invalid value for count. Must be greater than or equal to 0.");
    }
    
    
    
    this.count = count;
    return this;
  }

   /**
   * Number of items for current page
   * minimum: 0
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Number of items for current page")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    if (count != null && count < 0) {
      throw new IllegalArgumentException("Invalid value for count. Must be greater than or equal to 0.");
    }
    
    
    this.count = count;
  }


  public DefaultRemunerationComponentsListMetaPagination perPage(Integer perPage) {
    if (perPage != null && perPage < 0) {
      throw new IllegalArgumentException("Invalid value for perPage. Must be greater than or equal to 0.");
    }
    
    
    
    this.perPage = perPage;
    return this;
  }

   /**
   * Items per page limit
   * minimum: 0
   * @return perPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Items per page limit")

  public Integer getPerPage() {
    return perPage;
  }


  public void setPerPage(Integer perPage) {
    if (perPage != null && perPage < 0) {
      throw new IllegalArgumentException("Invalid value for perPage. Must be greater than or equal to 0.");
    }
    
    
    this.perPage = perPage;
  }


  public DefaultRemunerationComponentsListMetaPagination currentPage(Integer currentPage) {
    if (currentPage != null && currentPage < 1) {
      throw new IllegalArgumentException("Invalid value for currentPage. Must be greater than or equal to 1.");
    }
    
    
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Current page
   * minimum: 1
   * @return currentPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Current page")

  public Integer getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Integer currentPage) {
    if (currentPage != null && currentPage < 1) {
      throw new IllegalArgumentException("Invalid value for currentPage. Must be greater than or equal to 1.");
    }
    
    
    this.currentPage = currentPage;
  }


  public DefaultRemunerationComponentsListMetaPagination totalPages(Integer totalPages) {
    if (totalPages != null && totalPages < 1) {
      throw new IllegalArgumentException("Invalid value for totalPages. Must be greater than or equal to 1.");
    }
    
    
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total number of pages
   * minimum: 1
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Total number of pages")

  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    if (totalPages != null && totalPages < 1) {
      throw new IllegalArgumentException("Invalid value for totalPages. Must be greater than or equal to 1.");
    }
    
    
    this.totalPages = totalPages;
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
   * @return the DefaultRemunerationComponentsListMetaPagination instance itself
   */
  public DefaultRemunerationComponentsListMetaPagination putAdditionalProperty(String key, Object value) {
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
    DefaultRemunerationComponentsListMetaPagination defaultRemunerationComponentsListMetaPagination = (DefaultRemunerationComponentsListMetaPagination) o;
    return Objects.equals(this.total, defaultRemunerationComponentsListMetaPagination.total) &&
        Objects.equals(this.count, defaultRemunerationComponentsListMetaPagination.count) &&
        Objects.equals(this.perPage, defaultRemunerationComponentsListMetaPagination.perPage) &&
        Objects.equals(this.currentPage, defaultRemunerationComponentsListMetaPagination.currentPage) &&
        Objects.equals(this.totalPages, defaultRemunerationComponentsListMetaPagination.totalPages)&&
        Objects.equals(this.additionalProperties, defaultRemunerationComponentsListMetaPagination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, count, perPage, currentPage, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultRemunerationComponentsListMetaPagination {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
    openapiFields.add("total");
    openapiFields.add("count");
    openapiFields.add("per_page");
    openapiFields.add("current_page");
    openapiFields.add("total_pages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DefaultRemunerationComponentsListMetaPagination
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DefaultRemunerationComponentsListMetaPagination.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DefaultRemunerationComponentsListMetaPagination is not found in the empty JSON string", DefaultRemunerationComponentsListMetaPagination.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DefaultRemunerationComponentsListMetaPagination.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DefaultRemunerationComponentsListMetaPagination' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DefaultRemunerationComponentsListMetaPagination> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DefaultRemunerationComponentsListMetaPagination.class));

       return (TypeAdapter<T>) new TypeAdapter<DefaultRemunerationComponentsListMetaPagination>() {
           @Override
           public void write(JsonWriter out, DefaultRemunerationComponentsListMetaPagination value) throws IOException {
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
           public DefaultRemunerationComponentsListMetaPagination read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DefaultRemunerationComponentsListMetaPagination instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DefaultRemunerationComponentsListMetaPagination given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DefaultRemunerationComponentsListMetaPagination
  * @throws IOException if the JSON string is invalid with respect to DefaultRemunerationComponentsListMetaPagination
  */
  public static DefaultRemunerationComponentsListMetaPagination fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DefaultRemunerationComponentsListMetaPagination.class);
  }

 /**
  * Convert an instance of DefaultRemunerationComponentsListMetaPagination to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

