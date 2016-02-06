/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.knowledgebase.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedGroupedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KBFolder service. Represents a row in the &quot;KBFolder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.knowledgebase.model.impl.KBFolderModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.knowledgebase.model.impl.KBFolderImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KBFolder
 * @see com.liferay.knowledgebase.model.impl.KBFolderImpl
 * @see com.liferay.knowledgebase.model.impl.KBFolderModelImpl
 * @generated
 */
@ProviderType
public interface KBFolderModel extends BaseModel<KBFolder>, ShardedModel,
	StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a k b folder model instance should use the {@link KBFolder} interface instead.
	 */

	/**
	 * Returns the primary key of this k b folder.
	 *
	 * @return the primary key of this k b folder
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this k b folder.
	 *
	 * @param primaryKey the primary key of this k b folder
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this k b folder.
	 *
	 * @return the uuid of this k b folder
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this k b folder.
	 *
	 * @param uuid the uuid of this k b folder
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the kb folder ID of this k b folder.
	 *
	 * @return the kb folder ID of this k b folder
	 */
	public long getKbFolderId();

	/**
	 * Sets the kb folder ID of this k b folder.
	 *
	 * @param kbFolderId the kb folder ID of this k b folder
	 */
	public void setKbFolderId(long kbFolderId);

	/**
	 * Returns the group ID of this k b folder.
	 *
	 * @return the group ID of this k b folder
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this k b folder.
	 *
	 * @param groupId the group ID of this k b folder
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this k b folder.
	 *
	 * @return the company ID of this k b folder
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this k b folder.
	 *
	 * @param companyId the company ID of this k b folder
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this k b folder.
	 *
	 * @return the user ID of this k b folder
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this k b folder.
	 *
	 * @param userId the user ID of this k b folder
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this k b folder.
	 *
	 * @return the user uuid of this k b folder
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this k b folder.
	 *
	 * @param userUuid the user uuid of this k b folder
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this k b folder.
	 *
	 * @return the user name of this k b folder
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this k b folder.
	 *
	 * @param userName the user name of this k b folder
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this k b folder.
	 *
	 * @return the create date of this k b folder
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this k b folder.
	 *
	 * @param createDate the create date of this k b folder
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this k b folder.
	 *
	 * @return the modified date of this k b folder
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this k b folder.
	 *
	 * @param modifiedDate the modified date of this k b folder
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the parent k b folder ID of this k b folder.
	 *
	 * @return the parent k b folder ID of this k b folder
	 */
	public long getParentKBFolderId();

	/**
	 * Sets the parent k b folder ID of this k b folder.
	 *
	 * @param parentKBFolderId the parent k b folder ID of this k b folder
	 */
	public void setParentKBFolderId(long parentKBFolderId);

	/**
	 * Returns the name of this k b folder.
	 *
	 * @return the name of this k b folder
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this k b folder.
	 *
	 * @param name the name of this k b folder
	 */
	public void setName(String name);

	/**
	 * Returns the url title of this k b folder.
	 *
	 * @return the url title of this k b folder
	 */
	@AutoEscape
	public String getUrlTitle();

	/**
	 * Sets the url title of this k b folder.
	 *
	 * @param urlTitle the url title of this k b folder
	 */
	public void setUrlTitle(String urlTitle);

	/**
	 * Returns the description of this k b folder.
	 *
	 * @return the description of this k b folder
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this k b folder.
	 *
	 * @param description the description of this k b folder
	 */
	public void setDescription(String description);

	/**
	 * Returns the last publish date of this k b folder.
	 *
	 * @return the last publish date of this k b folder
	 */
	@Override
	public Date getLastPublishDate();

	/**
	 * Sets the last publish date of this k b folder.
	 *
	 * @param lastPublishDate the last publish date of this k b folder
	 */
	@Override
	public void setLastPublishDate(Date lastPublishDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.knowledgebase.model.KBFolder kbFolder);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.knowledgebase.model.KBFolder> toCacheModel();

	@Override
	public com.liferay.knowledgebase.model.KBFolder toEscapedModel();

	@Override
	public com.liferay.knowledgebase.model.KBFolder toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}