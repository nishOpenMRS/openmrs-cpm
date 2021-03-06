define([
    './index',
    'config'
  ],
  function(services, config) {

    'use strict';

    services.service('SearchConcept', function($http) {
      this.runQuery = function(searchTerm, currReqNum) {
        return $http.get(config.contextPath + '/ws/cpm/concepts?query=' +
          encodeURIComponent(searchTerm) + '&requestNum=' + currReqNum);
      };
    });
  }
);