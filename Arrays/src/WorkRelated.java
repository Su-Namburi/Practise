//                if(stringFields.contains(fieldName)) {
//                    List<String> result = queryFilters.getFilteredList(queryFilterModel,feedMapManager);
//                    fieldFiltersMap.put(fieldName,result);
//                }

//                    if(stringFields.contains(fieldName) && fieldFiltersMap.containsKey(fieldName)) {
//                        response.put(fieldName,fieldFiltersMap.get(fieldName));
//                    }
//                    else {
//                        response.put(fieldName,new JSONArray(feedMapManager.getFieldValues(fieldName)));
//                    }
//                } else {
//                    response.put(fieldName, new JSONArray());



//import java.util.*;
//
//public class WorkRelated {
//    public String getFieldValues(@RequestBody String requestBody) {
//        try {
//            JSONObject request = new JSONObject(requestBody);
//            String datasetName = request.getString("datasetname");
//            String userId = request.getString("userid");
//            JSONArray fields = request.getJSONArray("fields");
//
//            UserManager userManager = new UserManager();
//            String userLogin = userManager.getUserLoginByUserId(userId);
//
//            FeedMapManager feedMapManager = queryProcessorStore.getFeedMapManager(datasetName);
//            if (feedMapManager == null) {
//                return "{\"error\": \"Dataset files not ready\"}";
//            }
//            //introducing row filters
//            List<QueryFilterModel> rowFilters = this.queryFilters.getQueryFiltersForRowLevelAccess(userLogin,datasetName);
//
//            Set<String> stringFields = feedMapManager.getStringFieldsWithValues();  //To fetch String fieldnames
//            //A map to store field and corresponding row filters and equals and does not equal lists
//            Map<String, Map<String,List<String>>>rowFiltersMap = new HashMap<>();
//            //lopping through the Query filter models
//            for(QueryFilterModel model : rowFilters) {
//                //get the field name
//                String fieldName = model.getField();
//                //get all values of that particular field
//                List<String> valuesOfTheField = feedMapManager.getFieldValues(fieldName);
//                //consider it only if it is a string field
//                if(stringFields.contains(fieldName)) {
//                    // inner map to store equal and does not equal list
//                    Map<String,List<String>> innerMap = new HashMap<>();
//                    //get the operator
//                    if(model.getOperator().equalsIgnoreCase("Equals")) {
//                        //if equals get values of and store as value for equals key
//                        innerMap.put("Equals",model.getValues());
//                        //store the rest for does not equals key
//                        //valuesOfTheField.removeAll(model.getValues()); innerMap.put("Does Not Equal",valuesOfTheField);
//                        innerMap.put("Does Not Equal",model.getValues());
//                    }
//                    else {
//                        valuesOfTheField.removeAll(model.getValues());
//                        innerMap.put("Does Not Equal",valuesOfTheField);
//                        innerMap.put("Equals",valuesOfTheField);
//                    }
//                    //store values in the row filter map
//                    rowFiltersMap.put(fieldName,innerMap);
//                }
//
//            }
//            System.out.println(rowFiltersMap);
//            // Build response with field values
//            JSONObject response = new JSONObject();
//            for (int i = 0; i < fields.length(); i++) {         //the values which the user sets for filtering
//                String fieldName = fields.getString(i);
//                //check if the field has values
//                if (feedMapManager.hasFieldValues(fieldName)) {
//                    List<String> allFieldValues = feedMapManager.getFieldValues(fieldName);  //List of valid values for the field, or empty list if field not found
//                    JSONObject fieldResponse = new JSONObject();
//                    //check if the field is string and also has a row filter condition
//                    if(stringFields.contains(fieldName) && rowFiltersMap.containsKey(fieldName)) {
//                        //loop through the QueryFilterModel
//                        for(QueryFilterModel model : rowFilters) {
//                            //fetch the operator/condition
//                            String operator = model.getOperator();
//                            //store the innermap of rowfilter map as a temp map
//                            Map<String,List<String>> temp = rowFiltersMap.get(fieldName);
//
//                            fieldResponse.put(EQUALS,temp.getOrDefault(EQUALS,new ArrayList<>()));
//                            fieldResponse.put(DOES_NOT_EQUAL,temp.getOrDefault(DOES_NOT_EQUAL,new ArrayList<>()));
//                        }
//                    }
//                    else {
//                        fieldResponse.put(EQUALS,allFieldValues);
//                        fieldResponse.put(DOES_NOT_EQUAL,allFieldValues);
//                    }
//                    response.put(fieldName,fieldResponse);
//                } else {
//                    response.put(fieldName, new JSONArray());
//                }
//            }
//
//            return response.toString();
//
//        } catch (Exception e) {
//            log.error("Error getting field values", e);
//            return "{\"error\": \"" + e.getMessage() + "\"}";
//        }
//    }
//}
