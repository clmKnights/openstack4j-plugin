package org.openbaton.drivers.openstack4j;

import javax.persistence.Entity;
import org.openbaton.catalogue.mano.common.ConnectionPoint;

/** Created by jampabi on 3/9/17. */
@Entity
public class VNFDConnectionPointOP extends ConnectionPoint {
  /**
   * References an internal Virtual Link (vnfd:virtual_link:id, see clause 6.3.1.3) to which other
   * VDUs, NFs, and other types of endpoints can connect.
   */
  private String virtual_link_reference;

  private String floatingIp;

  private String fixedIp;

  public int getInterfaceId() {
    return interfaceId;
  }

  public void setInterfaceId(int interfaceId) {
    this.interfaceId = interfaceId;
  }

  private int interfaceId;

  @Override
  public String toString() {
    return "VNFDConnectionPoint{"
        + "virtual_link_reference='"
        + virtual_link_reference
        + '\''
        + ", floatingIp='"
        + floatingIp
        + '\''
        + ", fixedip='"
        + fixedIp
        + '\''
        + ", interfaceId="
        + interfaceId
        + "} "
        + super.toString();
  }

  public VNFDConnectionPointOP() {}

  public String getFloatingIp() {
    return floatingIp;
  }

  public void setFloatingIp(String floatingIp) {
    this.floatingIp = floatingIp;
  }

  public String getFixedIp() {
    return fixedIp;
  }

  public void setFixedIp(String fixedIp) {
    this.fixedIp = fixedIp;
  }

  public String getVirtual_link_reference() {
    return virtual_link_reference;
  }

  public void setVirtual_link_reference(String virtual_link_reference) {
    this.virtual_link_reference = virtual_link_reference;
  }
}
