package com.recombee.api_clients.api_requests;

/*
 This file is auto-generated, do not edit
*/

import java.util.Map;
import java.util.HashMap;

import com.recombee.api_clients.util.HTTPMethod;

/**
 * List all the detail views of a given item ever made by different users.
 */
public class ListItemDetailViews extends Request {

    /**
     * ID of the item of which the detail views are to be listed.
     */
    protected String itemId;

    /**
     * Construct the request
     * @param itemId ID of the item of which the detail views are to be listed.
     */
    public ListItemDetailViews (String itemId) {
        this.itemId = itemId;
        this.timeout = 100000;
    }


    public String getItemId() {
         return this.itemId;
    }

    /**
     * @return Used HTTP method
     */
    @Override
    public HTTPMethod getHTTPMethod() {
        return HTTPMethod.GET;
    }

    /**
     * @return URI to the endpoint including path parameters
     */
    @Override
    public String getPath() {
        return String.format("/items/%s/detailviews/", this.itemId);
    }

    /**
     * Get query parameters
     * @return Values of query parameters (name of parameter: value of the parameter)
     */
    @Override
    public Map<String, Object> getQueryParameters() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        return params;
    }

    /**
     * Get body parameters
     * @return Values of body parameters (name of parameter: value of the parameter)
     */
    @Override
    public Map<String, Object> getBodyParameters() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        return params;
    }

}