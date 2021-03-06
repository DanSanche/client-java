/**
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.grafeas.v1alpha1.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.grafeas.v1alpha1.model.AttestationAuthorityHint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Note kind that represents a logical attestation \&quot;role\&quot; or \&quot;authority\&quot;.  For example, an organization might have one AttestationAuthority for \&quot;QA\&quot; and one for \&quot;build\&quot;.  This Note is intended to act strictly as a grouping mechanism for the attached Occurrences (Attestations).  This grouping mechanism also provides a security boundary, since IAM ACLs gate the ability for a principle to attach an Occurrence to a given Note.  It also provides a single point of lookup to find all attached Attestation Occurrences, even if they don&#39;t all live in the same project.
 */
@ApiModel(description = "Note kind that represents a logical attestation \"role\" or \"authority\".  For example, an organization might have one AttestationAuthority for \"QA\" and one for \"build\".  This Note is intended to act strictly as a grouping mechanism for the attached Occurrences (Attestations).  This grouping mechanism also provides a security boundary, since IAM ACLs gate the ability for a principle to attach an Occurrence to a given Note.  It also provides a single point of lookup to find all attached Attestation Occurrences, even if they don't all live in the same project.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T18:21:51.795-04:00")
public class AttestationAuthority   {
  @SerializedName("hint")
  private AttestationAuthorityHint hint = null;

  public AttestationAuthority hint(AttestationAuthorityHint hint) {
    this.hint = hint;
    return this;
  }

   /**
   * Get hint
   * @return hint
  **/
  @ApiModelProperty(example = "null", value = "")
  public AttestationAuthorityHint getHint() {
    return hint;
  }

  public void setHint(AttestationAuthorityHint hint) {
    this.hint = hint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttestationAuthority attestationAuthority = (AttestationAuthority) o;
    return Objects.equals(this.hint, attestationAuthority.hint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttestationAuthority {\n");
    
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

