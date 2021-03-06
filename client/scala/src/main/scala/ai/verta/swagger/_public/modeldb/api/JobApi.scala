// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.swagger._public.modeldb.api

import scala.collection.mutable
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.concurrent.duration.Duration
import scala.util.Try

import ai.verta.swagger.client.HttpClient
import ai.verta.swagger.client.objects._
import ai.verta.swagger._public.modeldb.model._

class JobApi(client: HttpClient, val basePath: String = "/v1") {
  def createJobAsync(body: ModeldbCreateJob)(implicit ec: ExecutionContext): Future[Try[ModeldbCreateJobResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (body == null) throw new Exception("Missing required parameter \"body\"")
    return client.request[ModeldbCreateJob, ModeldbCreateJobResponse]("POST", basePath + s"/job/createJob", __query.toMap, body, ModeldbCreateJobResponse.fromJson)
  }

  def createJob(body: ModeldbCreateJob)(implicit ec: ExecutionContext): Try[ModeldbCreateJobResponse] = Await.result(createJobAsync(body), Duration.Inf)

  def deleteJobAsync(id: Option[String]=None)(implicit ec: ExecutionContext): Future[Try[ModeldbDeleteJobResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (id.isDefined) __query.update("id", client.toQuery(id.get))
    val body: String = null
    return client.request[String, ModeldbDeleteJobResponse]("GET", basePath + s"/job/deleteJob", __query.toMap, body, ModeldbDeleteJobResponse.fromJson)
  }

  def deleteJob(id: Option[String]=None)(implicit ec: ExecutionContext): Try[ModeldbDeleteJobResponse] = Await.result(deleteJobAsync(id), Duration.Inf)

  def getJobAsync(id: Option[String]=None)(implicit ec: ExecutionContext): Future[Try[ModeldbGetJobResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (id.isDefined) __query.update("id", client.toQuery(id.get))
    val body: String = null
    return client.request[String, ModeldbGetJobResponse]("GET", basePath + s"/job/getJob", __query.toMap, body, ModeldbGetJobResponse.fromJson)
  }

  def getJob(id: Option[String]=None)(implicit ec: ExecutionContext): Try[ModeldbGetJobResponse] = Await.result(getJobAsync(id), Duration.Inf)

  def updateJobAsync(end_time: Option[String]=None, id: Option[String]=None, job_status: Option[String]=None)(implicit ec: ExecutionContext): Future[Try[ModeldbUpdateJobResponse]] = {
    var __query = new mutable.HashMap[String,String]
    if (id.isDefined) __query.update("id", client.toQuery(id.get))
    if (end_time.isDefined) __query.update("end_time", client.toQuery(end_time.get))
    if (job_status.isDefined) __query.update("job_status", client.toQuery(job_status.get))
    val body: String = null
    return client.request[String, ModeldbUpdateJobResponse]("GET", basePath + s"/job/updateJob", __query.toMap, body, ModeldbUpdateJobResponse.fromJson)
  }

  def updateJob(end_time: Option[String]=None, id: Option[String]=None, job_status: Option[String]=None)(implicit ec: ExecutionContext): Try[ModeldbUpdateJobResponse] = Await.result(updateJobAsync(end_time, id, job_status), Duration.Inf)

}
