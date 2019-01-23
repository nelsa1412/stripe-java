// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SourceTypeBancontact extends StripeObject {
  String bankCode;

  String bankName;

  String bic;

  String ibanLast4;

  String preferredLanguage;

  String statementDescriptor;
}