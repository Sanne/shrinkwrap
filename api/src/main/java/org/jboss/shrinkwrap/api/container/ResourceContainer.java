/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.api.container;

import java.io.File;
import java.net.URL;

import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.Asset;
import org.jboss.shrinkwrap.api.Path;

/**
 * ResourceContainer
 * 
 * Defines the contract for a component capable of storing 
 * a series of {@link ClassLoader} resources
 * <br/><br/>
 * The actual path to the Resources within the {@link Archive} 
 * is up to the implementations/specifications.
 *
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 * @author <a href="mailto:aslak@conduct.no">Aslak Knutsen</a>
 * @version $Revision: $
 */
public interface ResourceContainer<T extends Archive<T>>
{
   //-------------------------------------------------------------------------------------||
   // Contracts --------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Adds the resource with the specified name
    * to the container, returning the container itself.
    * <br/><br/>
    * The {@link ClassLoader} used to obtain the resource is up to
    * the implementation.  The resource will be placed into 
    * the Container under the same context from which it was retrieved.
    * <br/>
    * For instance a resourceName of "META-INF/resource.xml" will be placed
    * at the same location within the Container.
    * 
    * @param resourceName Name of the {@link ClassLoader} resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException If the name is null
    */
   T addResource(String resourceName) throws IllegalArgumentException;
   
   /**
    * 
    * @param resource The resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException If the resource is null 
    */
   T addResource(File resource) throws IllegalArgumentException;

   /**
    * Adds the resource with the specified name
    * to the container, returning the container itself.
    * <br/><br/> 
    * The {@link ClassLoader} used to obtain the resource is up to
    * the implementation.  The resource will be placed into 
    * the Container under the same context specified by
    * "target"
    * 
    * @param target The target within the archive into which we'll place the resource
    * @param resourceName Name of the {@link ClassLoader} resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException If the target is null
    * @throws IllegalArgumentException If the resourceName is null
    */
   T addResource(String target, String resourceName) throws IllegalArgumentException;
   
   /**
    * 
    * @param target The target within the archive into which we'll place the resource
    * @param resource The resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException If the target is null
    * @throws IllegalArgumentException If the resource is null 
    */
   T addResource(String target, File resource) throws IllegalArgumentException;
   
   /**
    * 
    * @param target The target within the archive into which we'll place the resource
    * @param resource The resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException If the target is null
    * @throws IllegalArgumentException If the resource is null 
    */
   T addResource(String target, URL resource) throws IllegalArgumentException;

   /**
    * 
    * @param target The target within the archive into which we'll place the resource
    * @param resource The resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException If the target is null
    * @throws IllegalArgumentException If the resource is null 
    */
   T addResource(String target, Asset resource) throws IllegalArgumentException;

   /**
    * Adds the resource with the specified name
    * to the container, returning the container itself.
    * <br/><br/>
    * The {@link ClassLoader} used to obtain the resource is up to
    * the implementation.  The resource will be placed into 
    * the Container under the same context specified by
    * "target"
    * 
    * @param target The target within the archive into which we'll place the resource
    * @param resourceName Name of the {@link ClassLoader} resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException If the target is null
    * @throws IllegalArgumentException If the resourceName is null
    */
   T addResource(Path target, String resourceName) throws IllegalArgumentException;
   
   /**
    * Adds the specified resource to the {@link Archive}, using the specified {@link ClassLoader}
    * to load the resource
    * 
    * @param target The target within the archive into which we'll place the resource
    * @param resourceName The name of the resource to load
    * @param classLoader The ClassLoader from where the resource should be loaded
    * @return This virtual archive
    * @throws IllegalArgumentException If the target is null
    * @throws IllegalArgumentException If the resourceName is null
    * @throws IllegalArgumentException If the classLoader is null
    */
   T addResource(Path target, String resourceName, ClassLoader classLoader) throws IllegalArgumentException;


   /**
    * 
    * @param target The target within the archive into which we'll place the resource
    * @param resource The resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException If the target is null
    * @throws IllegalArgumentException If the resource is null 
    */
   T addResource(Path target, File resource) throws IllegalArgumentException;

   /**
    * Adds the resource located at the specified {@link URL} to
    * the archive at the specified path.
    * 
    * @param target The target within the archive into which we'll place the resource
    * @param resource The resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException If the target is null
    * @throws IllegalArgumentException If the resource is null 
    */
   T addResource(Path target, URL resource) throws IllegalArgumentException;

   /**
    * 
    * @param target The target within the archive into which we'll place the resource
    * @param resource The resource to add
    * @return This virtual archive
    * @throws IllegalArgumentException If the target is null
    * @throws IllegalArgumentException If the resource is null 
    */
   T addResource(Path target, Asset resource) throws IllegalArgumentException;
}
