package io.swagger.quay.client.model;

import io.swagger.quay.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Fields which can be updated in a repository.
 **/
@ApiModel(description = "Fields which can be updated in a repository.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-11T12:10:45.220-05:00")
public class RepoUpdate   {
  
  private String description = null;

  
  /**
   * Markdown encoded description for the repository
   **/
  @ApiModelProperty(required = true, value = "Markdown encoded description for the repository")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoUpdate {\n");
    
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
