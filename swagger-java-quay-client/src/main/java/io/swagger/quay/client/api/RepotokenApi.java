package io.swagger.quay.client.api;

import io.swagger.quay.client.ApiException;
import io.swagger.quay.client.ApiClient;
import io.swagger.quay.client.Configuration;
import io.swagger.quay.client.Pair;
import io.swagger.quay.client.TypeRef;

import io.swagger.quay.client.model.NewToken;
import io.swagger.quay.client.model.TokenPermission;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-12-11T12:10:45.220-05:00")
public class RepotokenApi {
  private ApiClient apiClient;

  public RepotokenApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RepotokenApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * 
   * List the tokens for the specified repository.
   * @param repository The full path of the repository. e.g. namespace/name
   * @return void
   */
  public void listRepoTokens (String repository) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'repository' is set
    if (repository == null) {
      throw new ApiException(400, "Missing the required parameter 'repository' when calling listRepoTokens");
    }
    
    // create path and map variables
    String path = "/api/v1/repository/{repository}/tokens/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "repository" + "\\}", apiClient.escapeString(repository.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "oauth2_implicit" };

    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * 
   * Create a new repository token.
   * @param repository The full path of the repository. e.g. namespace/name
   * @param body Request body contents.
   * @return void
   */
  public void createToken (String repository, NewToken body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'repository' is set
    if (repository == null) {
      throw new ApiException(400, "Missing the required parameter 'repository' when calling createToken");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createToken");
    }
    
    // create path and map variables
    String path = "/api/v1/repository/{repository}/tokens/".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "repository" + "\\}", apiClient.escapeString(repository.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "oauth2_implicit" };

    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * 
   * Fetch the specified repository token information.
   * @param code The token code
   * @param repository The full path of the repository. e.g. namespace/name
   * @return void
   */
  public void getTokens (String code, String repository) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getTokens");
    }
    
    // verify the required parameter 'repository' is set
    if (repository == null) {
      throw new ApiException(400, "Missing the required parameter 'repository' when calling getTokens");
    }
    
    // create path and map variables
    String path = "/api/v1/repository/{repository}/tokens/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()))
      .replaceAll("\\{" + "repository" + "\\}", apiClient.escapeString(repository.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "oauth2_implicit" };

    
    apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * 
   * Update the permissions for the specified repository token.
   * @param code The token code
   * @param repository The full path of the repository. e.g. namespace/name
   * @param body Request body contents.
   * @return void
   */
  public void changeToken (String code, String repository, TokenPermission body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling changeToken");
    }
    
    // verify the required parameter 'repository' is set
    if (repository == null) {
      throw new ApiException(400, "Missing the required parameter 'repository' when calling changeToken");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling changeToken");
    }
    
    // create path and map variables
    String path = "/api/v1/repository/{repository}/tokens/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()))
      .replaceAll("\\{" + "repository" + "\\}", apiClient.escapeString(repository.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "oauth2_implicit" };

    
    apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * 
   * Delete the repository token.
   * @param code The token code
   * @param repository The full path of the repository. e.g. namespace/name
   * @return void
   */
  public void deleteToken (String code, String repository) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling deleteToken");
    }
    
    // verify the required parameter 'repository' is set
    if (repository == null) {
      throw new ApiException(400, "Missing the required parameter 'repository' when calling deleteToken");
    }
    
    // create path and map variables
    String path = "/api/v1/repository/{repository}/tokens/{code}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()))
      .replaceAll("\\{" + "repository" + "\\}", apiClient.escapeString(repository.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] { "oauth2_implicit" };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}
