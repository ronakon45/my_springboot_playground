package com.ronakon45.playground;

class CustomerNotFoundException extends RuntimeException {

    CustomerNotFoundException(Long id) {
      super("Could not find customer " + id);
    }
  }